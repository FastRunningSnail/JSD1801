package me.map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ����mapʵ�֣�ͳ������{1,3,8,2,3,7,1}��ÿ��Ԫ�س��ֵĴ�����������ظ����ֵ�Ԫ��
 * 
 * @author Administrator
 *
 */
public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 3);
		map.put(3, 8);
		map.put(4, 2);
		map.put(5, 3);
		map.put(6, 7);
		map.put(7, 1);
		map.values();

		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;   int count2=0;
		for (int i = 1; i < 2; i++) {
			for (Integer value : map.values()) {
				System.out.println("���γ��ֵ�ֵ�ǣ�" + value + "  ");
				if(value == 1){
					count++;
				}else if(value == 3){
					count2++;
				}
			}
		}
		System.out.println("1������"+count+"��");
		System.out.println("3������"+count2+"��");
		

		System.out.println();
		// ��ӡ������Щֵһ��������
		Object[] arr = map.values().toArray();
		System.out.println(arr);
		// ��ӡ��ϣ��
		System.out.println(map);
		// ��ӡ��ϣ���Ԫ�ص�ֵ
		System.out.println("��ϣ���ȫ��Ԫ��ֵ�ǣ�" + map.values());

	}

}
