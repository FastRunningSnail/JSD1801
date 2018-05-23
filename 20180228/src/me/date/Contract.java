package me.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//计算合同续约日期： 当前时间签订合同，合同有效期是2年，请设计实现计算合同续约日期
//年份+2，月份不变，日期+1
public class Contract {
	public static Date getResignDate(Date signDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		// 子类调用父类的format方法将日期转成yyyyMMdd
		String signDate_str = sdf.format(signDate);

		// 将年月日找出来
		int year = Integer.parseInt(signDate_str.substring(0, 4));
		int month = Integer.parseInt(signDate_str.substring(4, 6));
		int day = Integer.parseInt(signDate_str.substring(6));

		// 计算续约日
		year += 2;
		day += 1;
		String resignDate_str = "" + year + month(month) + day;
		// System.out.println("续签日期是："+sdf.format(resignDate_str));//错误
		// System.out.println(resignDate_str); //无法打印resignDate_str
		// 利用SimpleDateFormat的parse方法将String类型的续约日期写成日期形式
		return sdf.parse(resignDate_str);
	}

	private static String month(int month) {
		if (month < 10)
			return "0" + month;
		return String.valueOf(month);
	}

	public static void main(String[] args) throws ParseException {
		Date dd = new Date();
		System.out.println(getResignDate(dd));
	}

}
