package me.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//打印5个学生的信息
		Student s1 = new Student(2011, "张三", 80.5);
		Student s2 = new Student(2012, "李四", 60.5);
		Student s3 = new Student(2013, "王五", 90);
		Student s4 = new Student(2014, "赵六", 95);
		Student s5 = new Student(2015, "谭七", 65);
		List list = new ArrayList();
		list.add(0, s1);
		list.add(1, s2);
		list.add(2, s3);
		list.add(3, s4);
		list.add(4, s5);
		System.out.println("5个学生的全部信息：");
		for (Object object : list) {
			
			System.out.println(object); 
		}
		//大于80分的学生信息
		System.out.println("大于80分的学生的信息：");
		if(s1.getScore()>80){
			System.out.println(s1);
		}
		if(s2.getScore()>80){
			System.out.println(s2);
		}
		if(s3.getScore()>80){
			System.out.println(s3);
		}
		if(s4.getScore()>80){
			System.out.println(s4);
		}
		if(s5.getScore()>80){
			System.out.println(s5);
		}
		//打印最高分学生的信息：
		
		//打印平均分
		System.out.println("5人的平均分是："+(s1.getScore()+s2.getScore()+s3.getScore()+s4.getScore()+s5.getScore())/5);
		
	}

}
