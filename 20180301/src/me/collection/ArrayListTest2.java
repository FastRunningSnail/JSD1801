package me.collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void aaa(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// ������
		ArrayList list = new ArrayList();// �ײ㣺this.elementData = {};

		// ���÷���
		list.add(1);// �ڼ��ϵĵ�һ��λ�÷���1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("�ٺٺ�"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		System.out.println(list);
		System.out.println("��������list����sizeΪ��" + list.size());

		Object obj = list.get(3);// this.elementData[3]
		System.out.println("����list�ĵ��ĸ�Ԫ���ǣ�" + obj);

		list.ensureCapacity(20);// �����ϵ������޸ĳ�20����ԭ�е�Ԫ�ذ���˳������������У�����Ŀռ���ȱʡֵ��ֵ
		list.ensureCapacity(1);// ��Ϊ��ǰ��������1���޸�ʧ��

		list.add(1, 1.0);// ����
		System.out.println(list);

		obj = list.remove(1);// ��������ɾ��
		System.out.println("�Ƴ���Ԫ���ǣ�" + obj);
		System.out.println("�Ƴ���������ǣ�" + list);

		list.remove(new Integer(1));// ����Ԫ�ر���ֵɾ������ȥ�ҵ�ֵΪxx��Ԫ��Ȼ��ɾ��
		System.out.println("ɾ��Ԫ��ֵΪ1��Ԫ��֮��������ǣ�" + list);

		int index = list.indexOf(1.2);// �Ҳ���1.2����-1
		System.out.println(index);

		boolean isExist = list.contains(1.2);
		System.out.println(isExist);

		obj = list.set(1, 999);// �滻
		System.out.println(list.get(1) + "<==>" + obj);
		System.out.println("��999�滻���ڶ���Ԫ��֮��������ǣ�" + list);

		System.out.println(list.isEmpty());

		Object[] objs = list.toArray();// ���ײ��������ЧԪ�ظ��Ƶ��µ�����
		System.out.println(objs);
		
		 for (Object object : objs) {
		 System.out.println(object);
		 }
		 list.clear();// ��Ԫ�ض���ȱʡֵ�滻������size����Ϊ0
		 System.out.println("ִ��clear�������֮��������ǣ�"+list);
	}

	 
}
