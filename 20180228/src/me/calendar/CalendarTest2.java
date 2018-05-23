package me.calendar;

import java.text.ParseException;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest2 {
	
	/**
	 * 签订两年，确定续签日期
	 * @param signDate
	 * @return
	 * @throws ParseException
	 */
	public static Date getResignDate(Date signDate) throws ParseException{
		Calendar sign_d = Calendar.getInstance();
		sign_d.setTime(signDate);
		//计算续约日
		sign_d.add(Calendar.YEAR, 2);
		sign_d.add(Calendar.DATE, 1);
		return sign_d.getTime();
	}
	public static void main(String[] args) throws ParseException{
		System.out.println(getResignDate(new Date()));
	}

	/**
	 * 根据合同签订日期获取合同续约日期，签订3年
	 * 
	 * @param signeDate
	 * @return
	 * @throws ParseException
	 */
//	public static Date getRenewDate(Date signeDate) throws ParseException {
//		// 1.date转成calendar
//		Calendar signe_c = Calendar.getInstance();
//		signe_c.setTime(signeDate);
//		// 2.计算续约日
//		signe_c.add(Calendar.YEAR, 3);
//		signe_c.add(Calendar.DATE, 1);
//		return signe_c.getTime();
//	}
//
//	public static void main(String[] args) throws ParseException {
//		System.out.println(getRenewDate(new Date()));
//	}
}
