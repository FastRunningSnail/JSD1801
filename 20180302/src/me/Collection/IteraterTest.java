package me.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraterTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);// 在集合的第一个位置放置1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("嘿嘿嘿"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		for(int index=0;index<list.size();index++){
			System.out.println(list.get(index));
		}
		
		System.out.println("\n");
		
//		Iterable
		Iterator it = list.iterator();  //ArrayList类型的list调用iterator方法 指向it
		while(it.hasNext()){
		System.out.println(it.next());
		}
//		for (Object object : list) {
//			System.out.println(object);
//			
//		}
	}

}
