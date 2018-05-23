package me.test;

import java.util.LinkedList;

public class Testa {
	LinkedList linkedlist = new LinkedList();

	public void in(Object object) {
		linkedlist.addFirst(object);

	}

	public Object out() {
		linkedlist.removeLast();
		return linkedlist;

	}

	public boolean isEmpty() {
		if (linkedlist.size() == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
			Testa ll = new Testa();
			ll.in("12");
			ll.in("13");
			ll.in("14");
			ll.out();
			System.out.print("剩余元素：");
			for (Object obj : ll.linkedlist) {
				System.out.print(obj+" ");
			}
			System.out.println();
			System.out.println("队列是否为空："+ll.isEmpty());
		}

}
