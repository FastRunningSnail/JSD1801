package me.checkhomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryTest {
	public static void main(String[] args) {
		// ��33��������ѡ��6������16��������ѡ��1������ϳ��н�����
		// ѡ��Ӧ�������
		// ��������ô��ʾ��ѡ�������ô��ƣ��н�������ô��ʾ��
		// ���鱣��������Լ��н�����
		// ѡ�񼯺����������飬��ʾÿһ�������

		// 1.�������򼯺�
//		ArrayList   //���Բ鿴ArrayList��
		List redballs = new ArrayList();
		for (int i = 1; i <= 33; i++) {
			redballs.add(i);
		}
		System.out.println("����ѡ��Χ��" + redballs);
		// 2.�������򼯺�
		List blueballs = new ArrayList();
		for (int i = 1; i <= 16; i++) {
			blueballs.add(i);
		}
		System.out.println("����ѡ��Χ��" + blueballs);
		// 3.�н����뼯��
		List pools = new ArrayList();
		// 4.ѡ��
		Random random = new Random();
		for (int i = 1; i <= 6; i++) {
			int index = random.nextInt(redballs.size());
			pools.add(redballs.get(index));// ȡ����Ӧ�ĺ��򣬷ŵ�������
			redballs.remove(index);// ȡ���ĺ�����ԭ���ļ�����
		}
		int index = random.nextInt(blueballs.size());
		pools.add(blueballs.get(index));// ȡ����Ӧ�����򣬷ŵ�������
		blueballs.remove(index);// ȡ����������ԭ���ļ����У�����е������
		// 5.����н�����
		System.out.println("�����н�����\t\t\t�ر����");
		System.out.println(pools + "\t" + pools.get(pools.size()-1));
	}

}
