package me.self;

public class Caos {
	//http://blog.csdn.net/OnePieceMonkey/article/details/79071953
	
//	1��ʱ���������
//	Java����  �ղش���
//
//
//	[java] view plain copy
//	//����һ��ȡϵͳ���    
//	DateTime dt1 = new DateTime();    
//	    
//	//��������ͨ��java.util.Date��������    
//	DateTime dt2 = new DateTime(new Date());    
//	    
//	//��������ָ�������յ��������(���������ǣ���,��,��,ʱ,��,��,����)    
//	DateTime dt3 = new DateTime(2012, 5, 20, 13, 14, 0, 0);    
//	    
//	//�����ģ�ISO8601��ʽ����    
//	DateTime dt4 = new DateTime("2012-05-20");    
//	DateTime dt5 = new DateTime("2012-05-20T13:14:00");    
//	    
//	//ֻ��Ҫ�����յ�ʱ��    
//	LocalDate localDate = new LocalDate(2009, 9, 6);// September 6, 2009    
//	    
//	//ֻ��Ҫʱ��������ʱ��    
//	LocalTime localTime = new LocalTime(13, 30, 26, 0);// 1:30:26PM    
//	2����ȡ�����յ����
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime dt = new DateTime();    
//	//��    
//	int year = dt.getYear();    
//	//��    
//	int month = dt.getMonthOfYear();    
//	//��    
//	int day = dt.getDayOfMonth();    
//	//����    
//	int week = dt.getDayOfWeek();    
//	//��    
//	int hour = dt.getHourOfDay();    
//	//��    
//	int min = dt.getMinuteOfHour();    
//	//��    
//	int sec = dt.getSecondOfMinute();    
//	//����    
//	int msec = dt.getMillisOfSecond();   
//
//	3�����ڵ����⴦��
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime dt = new DateTime();    
//	    
//	//����    
//	switch(dt.getDayOfWeek()) {    
//	case DateTimeConstants.SUNDAY:    
//	    System.out.println("������");    
//	    break;    
//	case DateTimeConstants.MONDAY:    
//	    System.out.println("����һ");    
//	    break;    
//	case DateTimeConstants.TUESDAY:    
//	    System.out.println("���ڶ�");    
//	    break;    
//	case DateTimeConstants.WEDNESDAY:    
//	    System.out.println("������");    
//	    break;    
//	case DateTimeConstants.THURSDAY:    
//	    System.out.println("������");    
//	    break;    
//	case DateTimeConstants.FRIDAY:    
//	    System.out.println("������");    
//	    break;    
//	case DateTimeConstants.SATURDAY:    
//	    System.out.println("������");    
//	    break;    
//	}    
//
//	4����JDK���ڶ����ת��
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime dt = new DateTime();    
//	    
//	//ת����java.util.Date����    
//	Date d1 = new Date(dt.getMillis());    
//	Date d2 = dt.toDate();    
//	    
//	//ת����java.util.Calendar����    
//	Calendar c1 = Calendar.getInstance();    
//	c1.setTimeInMillis(dt.getMillis());    
//	Calendar c2 = dt.toCalendar(Locale.getDefault());    
//	5������ǰ������
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime dt = new DateTime();    
//	    
//	//����    
//	DateTime yesterday = dt.minusDays(1);           
//	//����    
//	DateTime tomorrow = dt.plusDays(1);         
//	//1����ǰ    
//	DateTime before1month = dt.minusMonths(1);          
//	//3���º�    
//	DateTime after3month = dt.plusMonths(3);            
//	//2��ǰ    
//	DateTime before2year = dt.minusYears(2);            
//	//5���    
//	DateTime after5year = dt.plusYears(5);    
//	6��ȡ��������
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime dt = new DateTime();       
//	    
//	//��ĩ����      
//	DateTime lastday = dt.dayOfMonth().withMaximumValue();    
//	    
//	//90������ܵ���һ    
//	DateTime firstday = dt.plusDays(90).dayOfWeek().withMinimumValue();    
//	7��ʱ��
//	Java����  �ղش���
//
//	[java] view plain copy
//	//Ĭ������Ϊ�ձ�ʱ��    
//	DateTimeZone.setDefault(DateTimeZone.forID("Asia/Tokyo"));    
//	DateTime dt1 = new DateTime();    
//	    
//	//�׶�ʱ��    
//	DateTime dt2 = new DateTime(DateTimeZone.forID("Europe/London"));    
//	8����������
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime begin = new DateTime("2012-02-01");    
//	DateTime end = new DateTime("2012-05-01");    
//	    
//	//�������������    
//	Duration d = new Duration(begin, end);    
//	long time = d.getMillis();    
//	    
//	//������������    
//	Period p = new Period(begin, end, PeriodType.days());    
//	int days = p.getDays();    
//	    
//	//�����ض������Ƿ��ڸ�������    
//	Interval i = new Interval(begin, end);    
//	boolean contained = i.contains(new DateTime("2012-03-01"));    
//	9�����ڱȽ�
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime d1 = new DateTime("2012-02-01");    
//	DateTime d2 = new DateTime("2012-05-01");    
//	    
//	//��ϵͳʱ���    
//	boolean b1 = d1.isAfterNow();    
//	boolean b2 = d1.isBeforeNow();    
//	boolean b3 = d1.isEqualNow();    
//	    
//	//���������ڱ�    
//	boolean f1 = d1.isAfter(d2);    
//	boolean f2 = d1.isBefore(d2);    
//	boolean f3 = d1.isEqual(d2);    
//	10����ʽ�����
//	Java����  �ղش���
//
//	[java] view plain copy
//	DateTime dateTime = new DateTime();    
//	    
//	String s1 = dateTime.toString("yyyy/MM/dd hh:mm:ss.SSSa");    
//	String s2 = dateTime.toString("yyyy-MM-dd HH:mm:ss");    
//	String s3 = dateTime.toString("EEEE dd MMMM, yyyy HH:mm:ssa");    
//	String s4 = dateTime.toString("yyyy/MM/dd HH:mm ZZZZ");    
//	String s5 = dateTime.toString("yyyy/MM/dd HH:mm Z"); 

}
