package me.hashset;

import java.util.HashSet;
import java.util.Set;
/**
 * Set����ѧ�����ϵļ��ϵĳ���
 * @author Administrator
 *
 */

public class HashSetTest {
	public static void main(String[] args) {
//		Ĭ�Ϲ�������hashset�ײ�ά��һ��hashmap
//		
//		
		
		HashSet<String> hashset = new HashSet<>();
//		hashset.add("a");
//		hashset.add("a");   //������ӵڶ�����ͬ��ֵ
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
