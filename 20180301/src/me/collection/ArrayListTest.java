package me.collection;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1.1);
		list.add("123");
		list.add(new Exception("异常！！"));// Exception需要new才能成为Object的实例
		list.add(new int[] { 1, 2, 3 }); // 数组需要new
		list.add(1, 1.2);//在索引位置为1的地方增加int型的1.2，即在指定位置插入元素
		System.out.println(list);

		int i = 0;
		for (; i < 5; i++) {
			
			switch (i) {
			case 0:
//				System.out.println(list.get(i));
//				break;
			case 3:
//				System.out.println(list.get(i));
//				break;
			
//				break;
			case 1:
//				System.out.println(list.get(i));
//				break;
			case 4:
				System.out.println(list.get(i));
				break;
			case 2:
				break;
			default:
				break;
			}
		}
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
	}

}
