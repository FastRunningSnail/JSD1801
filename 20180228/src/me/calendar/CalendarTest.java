package me.calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		// ������������
		System.out.println(rightNow);
		// ���÷���
		rightNow.add(Calendar.YEAR, 1);
		System.out.println(rightNow.get(Calendar.YEAR));
		rightNow.add(Calendar.MONTH, -1);
		System.out.println(rightNow.get(Calendar.MONTH));
	}

}
