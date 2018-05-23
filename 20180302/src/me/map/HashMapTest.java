package me.map;

import java.util.HashMap;
//import java.util.Map;
/**
 * 映射
 * HashMap 是基于Hash表的单项链表
 * 哈希表是元素个数为16的数组，每一个元素都是一个无序的链表 (节点)
 * putVal方法中先判断哈希表是否为空，为空就添加new Node<K,V>,不为空就采取else的操作
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
		map.put(3, "王武");//查找3对应的节点
		map.put(7, "王武");
		String s = map.get(5);
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(s);
		
		//通过map获得所有的key
//		Set<Integer>
	}

}
