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
		map.put(7, "江浩阳");
		map.put(5, "茹乐勇");
		map.put(6, "陈广义");
		map.put(4, "李海泉");
		map.put(3, "柳均鹏");
		map.put(2, "梁弟全");
		map.put(1, "唐上琨");
		System.out.println(map);
		
		TreeMap<String,String> map2=new TreeMap<>();
		map2.put("7", "江浩阳");
		map2.put("5", "茹乐勇");
		map2.put("6", "陈广义");
		map2.put("4", "李海泉");
		map2.put("3", "柳均鹏");
		map2.put("2", "梁弟全");
		map2.put("1", "唐上琨");
		System.out.println(map2);
		
		TreeMap<Student,String> map3=new TreeMap<>();//Student未实现Compare接口
		map3.put(new Student("江浩阳",007), "江浩阳");
		map3.put(new Student("茹乐勇",005), "茹乐勇");
		map3.put(new Student("陈广义",006), "陈广义");
		map3.put(new Student("李海泉",004), "李海泉");
		map3.put(new Student("柳均鹏",003), "柳均鹏");
		map3.put(new Student("梁弟全",002), "梁弟全");
		map3.put(new Student("唐上琨",001), "唐上琨");
		System.out.println(map3);
		
		
	}
}
