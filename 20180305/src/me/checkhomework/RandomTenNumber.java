package me.checkhomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTenNumber {
	public static void main(String[] args) {
		List range = new ArrayList(); // ָ��������ķ�Χ
		// ����Χ����һ�����ϣ��Ա�֮���ڸü�����ȡ�����
		for (int i = 1; i <= 100; i++) {
			range.add(i);
		}
		// ������ѡ����漴�����ϼ���
		List choice = new ArrayList();

		Random random = new Random();
		// ѭ��ѡ��ʮ�������
		for (int i = 1; i <= 10; i++) {
			int index = random.nextInt(range.size());// ��ÿ������������ŵ�index������
			choice.add(range.get(index));// ���������������ӵ�choice��
			range.remove(index);// �Ƴ�ѡ���������
		}
		System.out.println(choice);
	}

}
