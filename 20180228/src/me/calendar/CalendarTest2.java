package me.calendar;

import java.text.ParseException;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {
	
	/**
	 * ǩ�����꣬ȷ����ǩ����
	 * @param signDate
	 * @return
	 * @throws ParseException
	 */
	public static Date getResignDate(Date signDate) throws ParseException{
		Calendar sign_d = Calendar.getInstance();
		sign_d.setTime(signDate);
		//������Լ��
		sign_d.add(Calendar.YEAR, 2);
		sign_d.add(Calendar.DATE, 1);
		return sign_d.getTime();
	}
	public static void main(String[] args) throws ParseException{
		System.out.println(getResignDate(new Date()));
	}

	/**
	 * ���ݺ�ͬǩ�����ڻ�ȡ��ͬ��Լ���ڣ�ǩ��3��
	 * 
	 * @param signeDate
	 * @return
	 * @throws ParseException
	 */
//	public static Date getRenewDate(Date signeDate) throws ParseException {
//		// 1.dateת��calendar
//		Calendar signe_c = Calendar.getInstance();
//		signe_c.setTime(signeDate);
//		// 2.������Լ��
//		signe_c.add(Calendar.YEAR, 3);
//		signe_c.add(Calendar.DATE, 1);
//		return signe_c.getTime();
//	}
//
//	public static void main(String[] args) throws ParseException {
//		System.out.println(getRenewDate(new Date()));
//	}
}
