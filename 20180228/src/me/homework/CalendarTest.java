package me.homework;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("你选择的月份是：" + year + "年" + month + "月");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		// 设置1号为月份的起始天
		cal.set(Calendar.DATE, 1);

		int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;// 当前月份的第一天是星期几
		System.out.println("本月第一天是星期"+firstDayOfWeek);
		int maxDaysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);// 一个月多少天
		System.out.println(year + "年" + month + "月共"+maxDaysOfMonth+"天");
		// 打印1号之前的空位
		System.out.println("星期日\t" + "星期一\t" + "星期二\t" + "星期三\t" + "星期四\t" + "星期五\t" + "星期六\t");
		for (int i = 0; i < firstDayOfWeek; i++) {
			System.out.print("\t");
		}
		// 除得尽7 就要换行输出,除不尽就输出日期加空格
		for (int each = 1; each <= maxDaysOfMonth; each++) {
			if ((each + firstDayOfWeek+1) % 7 ==1) {
				System.out.print("  "+each + "\t"+"\n");
			} else {
				System.out.print("  "+each + "\t");
			}
		}

	}

}
