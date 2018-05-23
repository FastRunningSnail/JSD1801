package me.collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void aaa(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// 构造器
		ArrayList list = new ArrayList();// 底层：this.elementData = {};

		// 常用方法
		list.add(1);// 在集合的第一个位置放置1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("嘿嘿嘿"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		System.out.println(list);
		System.out.println("以上数组list长度size为：" + list.size());

		Object obj = list.get(3);// this.elementData[3]
		System.out.println("数组list的第四个元素是：" + obj);

		list.ensureCapacity(20);// 将集合的容量修改成20，将原有的元素按照顺序放在新数组中，多余的空间用缺省值赋值
		list.ensureCapacity(1);// 因为当前容量大于1，修改失败

		list.add(1, 1.0);// 插入
		System.out.println(list);

		obj = list.remove(1);// 根据索引删除
		System.out.println("移除的元素是：" + obj);
		System.out.println("移除后的数组是：" + list);

		list.remove(new Integer(1));// 根据元素本身值删除，先去找到值为xx的元素然后删除
		System.out.println("删除元素值为1的元素之后的数组是：" + list);

		int index = list.indexOf(1.2);// 找不到1.2返回-1
		System.out.println(index);

		boolean isExist = list.contains(1.2);
		System.out.println(isExist);

		obj = list.set(1, 999);// 替换
		System.out.println(list.get(1) + "<==>" + obj);
		System.out.println("用999替换掉第二个元素之后的数组是：" + list);

		System.out.println(list.isEmpty());

		Object[] objs = list.toArray();// 将底层的数组有效元素复制到新的数组
		System.out.println(objs);
		
		 for (Object object : objs) {
		 System.out.println(object);
		 }
		 list.clear();// 将元素都用缺省值替换掉，将size重置为0
		 System.out.println("执行clear方法清除之后的数组是："+list);
	}

	 
}
