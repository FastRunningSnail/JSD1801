package me.test;

import java.util.LinkedList;

public class Test5 extends Test {
	LinkedList list = new LinkedList();
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		@SuppressWarnings("rawtypes")
		LinkedList list = new LinkedList();
		list.add("A");
		list.add(2, "B");
		String s = (String) list.get(1); // null
		System.out.println(s);
	}

}
