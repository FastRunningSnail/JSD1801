package me.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * 利用map实现：统计数组{1,3,8,2,3,7,1}中每个元素出现的次数，并输出重复出现的元素
 * 
 * @author Administrator
 *
 */

public class CheckHashMapTest2 {
	public static void main(String[] args) {
		int [] arr={1,3,8,2,3,7,1} ;
		Map<Integer, Integer> map= new HashMap<>();
		
		for(int i :arr){
			if(map.get(i)==null){
				map.put(i, 1);//记录出现一次
			}else{
				map.put(i, map.get(i)+1);//增加1次
			}
			System.out.println(map.get(i));
		}
	//遍历集合，输出重复元素
	Set<Integer> keyset = map.keySet();
	for (Integer integer : keyset) {
		if (map.get(integer)>=2){
			System.out.println("数字"+integer+"重复出现次数:"+map.get(integer));
		}else{
			System.out.println("数字"+integer+"仅出现1次");
		}
		
	}
	/**
	 * 根据次数对元素进行排序
	 */
}

}
