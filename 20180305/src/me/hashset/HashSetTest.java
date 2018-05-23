package me.hashset;

import java.util.HashSet;
import java.util.Set;
/**
 * Set是数学意义上的集合的抽象
 * @author Administrator
 *
 */

public class HashSetTest {
	public static void main(String[] args) {
//		默认构造器，hashset底层维护一个hashmap
//		
//		
		
		HashSet<String> hashset = new HashSet<>();
//		hashset.add("a");
//		hashset.add("a");   //不能添加第二个相同的值
		System.out.println(hashset.add("a"));
		System.out.println(hashset.add("a"));
		System.out.println(hashset.add("b"));
		System.out.println(hashset.add("e"));
		System.out.println(hashset.add("d"));
		System.out.println(hashset.add("f"));
		System.out.println(hashset.add("c"));
		System.out.println(hashset);
		
//		Set<Integer,String> hashset2 = new HashSet<>();
		
		
	}
	

}
