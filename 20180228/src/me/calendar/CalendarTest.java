package me.calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		// 创建日历对象
		System.out.println(rightNow);
		// 可用方法
		rightNow.add(Calendar.YEAR, 1);
		System.out.println(rightNow.get(Calendar.YEAR));
		rightNow.add(Calendar.MONTH, -1);
		System.out.println(rightNow.get(Calendar.MONTH));
	}

}
