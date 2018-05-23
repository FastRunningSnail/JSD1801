package me.checkhomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTenNumber {
	public static void main(String[] args) {
		List range = new ArrayList(); // 指定随机数的范围
		// 将范围生成一个集合，以便之后在该集合中取随机数
		for (int i = 1; i <= 100; i++) {
			range.add(i);
		}
		// 生成所选择的随即数集合集合
		List choice = new ArrayList();

		Random random = new Random();
		// 循环选择十个随机数
		for (int i = 1; i <= 10; i++) {
			int index = random.nextInt(range.size());// 将每次随机出的数放到index变量中
			choice.add(range.get(index));// 将随机出来的数添加到choice中
			range.remove(index);// 移除选过的随机数
		}
		System.out.println(choice);
	}

}
