package me.homework;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		System.out.println("��������ݣ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		System.out.println("��ѡ����·��ǣ�" + year + "��" + month + "��");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		// ����1��Ϊ�·ݵ���ʼ��
		cal.set(Calendar.DATE, 1);

		int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;// ��ǰ�·ݵĵ�һ�������ڼ�
		System.out.println("���µ�һ��������"+firstDayOfWeek);
		int maxDaysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);// һ���¶�����
		System.out.println(year + "��" + month + "�¹�"+maxDaysOfMonth+"��");
		// ��ӡ1��֮ǰ�Ŀ�λ
		System.out.println("������\t" + "����һ\t" + "���ڶ�\t" + "������\t" + "������\t" + "������\t" + "������\t");
		for (int i = 0; i < firstDayOfWeek; i++) {
			System.out.print("\t");
		}
		// ���þ�7 ��Ҫ�������,��������������ڼӿո�
		for (int each = 1; each <= maxDaysOfMonth; each++) {
			if ((each + firstDayOfWeek+1) % 7 ==1) {
				System.out.print("  "+each + "\t"+"\n");
			} else {
				System.out.print("  "+each + "\t");
			}
		}

	}

}
