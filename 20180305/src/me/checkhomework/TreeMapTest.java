package me.checkhomework;

import java.util.TreeMap;

public class TreeMapTest {
	TreeMap tm = new TreeMap();
	public TreeMap getTm() {
		return tm;
	}
	public void setTm(TreeMap tm) {
		this.tm = tm;
	}
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(7, "������");
		map.put(5, "������");
		map.put(6, "�¹���");
		map.put(4, "�Ȫ");
		map.put(3, "������");
		map.put(2, "����ȫ");
		map.put(1, "������");
		System.out.println(map);
		
		TreeMap<String,String> map2=new TreeMap<>();
		map2.put("7", "������");
		map2.put("5", "������");
		map2.put("6", "�¹���");
		map2.put("4", "�Ȫ");
		map2.put("3", "������");
		map2.put("2", "����ȫ");
		map2.put("1", "������");
		System.out.println(map2);
		
		TreeMap<Student,String> map3=new TreeMap<>();//Studentδʵ��Compare�ӿ�
		map3.put(new Student("������",007), "������");
		map3.put(new Student("������",005), "������");
		map3.put(new Student("�¹���",006), "�¹���");
		map3.put(new Student("�Ȫ",004), "�Ȫ");
		map3.put(new Student("������",003), "������");
		map3.put(new Student("����ȫ",002), "����ȫ");
		map3.put(new Student("������",001), "������");
		System.out.println(map3);
		
		
	}
}
