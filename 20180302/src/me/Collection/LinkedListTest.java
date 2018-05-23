package me.Collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		boolean a = list.isEmpty();
		System.out.println(a);
		list.add(123);
		list.add("aaa");
		list.add("123");
		list.add("abc");
		list.add("123");
		list.add(list.get(2));
		list.add(list.get(3));
		list.remove(0);
		list.remove("123");//只移除第一个值为123的元素
//		list.add(2, 120);
//		list.addFirst(100);
//		list.addLast(99);
//		list.offer(124);
//		list.offerFirst(110);
		Object [] objs =list.toArray();
		for (Object value : objs) {
			System.out.print(value+"  ");
			
		}
	}
	

}
