package jp180206;

import java.util.Scanner;

public class Test2 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入分数：（比如:86.5）");
		double score = scanner.nextDouble();
		String result = score >= 90 ? "A" : (score < 60 ? "C" : "B");// 三元表达式
		System.out.println("您的分数等级是：" + result);
		
		double score1 = scanner.nextDouble();
		String result1 = score1 >= 90 ? "A" : (score1 < 60 ? "C" : "B");// 三元表达式
		System.out.println("您的分数等级是：" + result1);
		scanner.close();
	}
}