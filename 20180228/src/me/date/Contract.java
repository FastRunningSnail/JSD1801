package me.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//�����ͬ��Լ���ڣ� ��ǰʱ��ǩ����ͬ����ͬ��Ч����2�꣬�����ʵ�ּ����ͬ��Լ����
//���+2���·ݲ��䣬����+1
public class Contract {
	public static Date getResignDate(Date signDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		// ������ø����format����������ת��yyyyMMdd
		String signDate_str = sdf.format(signDate);

		// ���������ҳ���
		int year = Integer.parseInt(signDate_str.substring(0, 4));
		int month = Integer.parseInt(signDate_str.substring(4, 6));
		int day = Integer.parseInt(signDate_str.substring(6));

		// ������Լ��
		year += 2;
		day += 1;
		String resignDate_str = "" + year + month(month) + day;
		// System.out.println("��ǩ�����ǣ�"+sdf.format(resignDate_str));//����
		// System.out.println(resignDate_str); //�޷���ӡresignDate_str
		// ����SimpleDateFormat��parse������String���͵���Լ����д��������ʽ
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
