package me.map;

import java.util.HashMap;
//import java.util.Map;
/**
 * ӳ��
 * HashMap �ǻ���Hash��ĵ�������
 * ��ϣ����Ԫ�ظ���Ϊ16�����飬ÿһ��Ԫ�ض���һ����������� (�ڵ�)
 * putVal���������жϹ�ϣ���Ƿ�Ϊ�գ�Ϊ�վ����new Node<K,V>,��Ϊ�վͲ�ȡelse�Ĳ���
 * @author Administrator
 *
 */

public class HashMapTest {
	public static void main(String[] args) {
//		Map<Integer,String> map = new HashMap<>();
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.put(3, "����");//����3��Ӧ�Ľڵ�
		map.put(7, "����");
		String s = map.get(5);
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(s);
		
		//ͨ��map������е�key
//		Set<Integer>
	}

}
