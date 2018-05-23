package me.map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 利用map实现：统计数组{1,3,8,2,3,7,1}中每个元素出现的次数，并输出重复出现的元素
 * 
 * @author Administrator
 *
 */
public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 3);
		map.put(3, 8);
		map.put(4, 2);
		map.put(5, 3);
		map.put(6, 7);
		map.put(7, 1);
		map.values();

		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;   int count2=0;
		for (int i = 1; i < 2; i++) {
			for (Integer value : map.values()) {
				System.out.println("本次出现的值是：" + value + "  ");
				if(value == 1){
					count++;
				}else if(value == 3){
					count2++;
				}
			}
		}
		System.out.println("1共出现"+count+"次");
		System.out.println("3共出现"+count2+"次");
		

		System.out.println();
		// 打印含有这些值一个新数组
		Object[] arr = map.values().toArray();
		System.out.println(arr);
		// 打印哈希表
		System.out.println(map);
		// 打印哈希表各元素的值
		System.out.println("哈希表的全部元素值是：" + map.values());

	}

}
