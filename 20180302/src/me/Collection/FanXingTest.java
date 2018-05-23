package me.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FanXingTest {
	
	public static  void addEach(List list) {
		for (int index = 0; index < list.size(); index++) {
			Object obj = list.get(index);
			if (obj instanceof Integer) {
				list.set(index, (Integer) obj + 1);
			} else if (obj instanceof String) {
				Integer val = Integer.valueOf((String) obj) + 1;
				list.set(index, val);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("123");
		list.add(new Exception("ºÙºÙºÙ£¡"));
		addEach(list);
		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<>();
		// list.add(1.1);
		list.add("123");
		list.add("abc");
		// list.add(new Exception("ºÙºÙºÙ"));
		System.out.println(list2);
		List<Integer> list3 = new LinkedList<>();
		list3.add(123);
		System.out.println(list3);
		Set<Exception> set = new HashSet<>();
		set.add(new Exception("Êä³öÒì³£"));
		System.out.println(set);
	}
}
