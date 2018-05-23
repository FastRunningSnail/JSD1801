package me.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
//		Set set = new HashSet(); //多态：父类的引用指向子类对象；看到的size方法是父类的size方法
		HashSet set = new HashSet();
		set.add("ccc");
		set.add("aaa");
		set.add("bbb");
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains("v"));
		System.out.println(set.iterator());
//		for(Iterator)
		
	}

}
