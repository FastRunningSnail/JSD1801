package me.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * ����mapʵ�֣�ͳ������{1,3,8,2,3,7,1}��ÿ��Ԫ�س��ֵĴ�����������ظ����ֵ�Ԫ��
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
				map.put(i, 1);//��¼����һ��
			}else{
				map.put(i, map.get(i)+1);//����1��
			}
			System.out.println(map.get(i));
		}
	//�������ϣ�����ظ�Ԫ��
	Set<Integer> keyset = map.keySet();
	for (Integer integer : keyset) {
		if (map.get(integer)>=2){
			System.out.println("����"+integer+"�ظ����ִ���:"+map.get(integer));
		}else{
			System.out.println("����"+integer+"������1��");
		}
		
	}
	/**
	 * ���ݴ�����Ԫ�ؽ�������
	 */
}

}
