package me.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraterTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);// �ڼ��ϵĵ�һ��λ�÷���1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("�ٺٺ�"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		for(int index=0;index<list.size();index++){
			System.out.println(list.get(index));
		}
		
		System.out.println("\n");
		
//		Iterable
		Iterator it = list.iterator();  //ArrayList���͵�list����iterator���� ָ��it
		while(it.hasNext()){
		System.out.println(it.next());
		}
//		for (Object object : list) {
//			System.out.println(object);
//			
//		}
	}

}
