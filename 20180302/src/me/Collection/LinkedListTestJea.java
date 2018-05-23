package me.Collection;

import java.util.LinkedList;

public class LinkedListTestJea {
	public static void main(String[] args) {
		// 构造器
		LinkedList list = new LinkedList();
		list.add(1);// 在集合的第一个位置放置1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("嘿嘿嘿"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.get(2));

		list.add(1, 1.2);// 插入

		list.remove(2);
		System.out.println(list);

		list.remove(new Integer(1));// 根据元素本身删除
		System.out.println(list);

		int index = list.indexOf(1.2);// 查找第一次出现元素的索引
		System.out.println(index);

		boolean isExist = list.contains(1.2);
		System.out.println(isExist);

		Object obj = list.set(1, 999);// 替换
		System.out.println(list.get(1) + "<==>" + obj);

		System.out.println(list.isEmpty());

		Object[] objs = list.toArray();// 将每个节点的数据部保存到长度为size的数组中
		for (Object object : objs) {
			System.out.println(object);
		}

		System.out.println(list.getFirst());
		list.offer(220);
		System.out.println(list.getLast());
		list.offerFirst(110);
		list.offerLast(120);
		System.out.println(list);

		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.pop());// 弹出栈顶元素
		System.out.println(list);
		list.push(119);
		System.out.println(list);

		list.clear();// 清除节点之间的链接，数据部，最后将首节点和尾节点重置为null
		System.out.println(list);
	}

}
