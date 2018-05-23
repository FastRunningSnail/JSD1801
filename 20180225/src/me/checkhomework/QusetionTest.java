package me.checkhomework;

import java.util.Scanner;

public class QusetionTest {
	public static void main(String[] args) {
		// 1.创建单选题
				String text = "1.以下哪句诗是\"汗滴禾下土\"的上半句？";
				String[] options = new String[4];
				options[0] = "A.粒粒皆辛苦";
				options[1] = "B.谁知盘中餐";
				options[2] = "C.锄禾日当午";
				options[3] = "D.床前明月光";
				char answer = 'C';
				SingleChoice question = new SingleChoice(text, options, answer);
				// 2.输出单选题
				System.out.println(question.getText());
				for (String op : options) {
					System.out.print(op + "\t");
				}
				System.out.println();// 换行
				// 3.用户输入答案
				Scanner sc = new Scanner(System.in);
				System.out.println("请输入答案：");
				String input = sc.nextLine().toUpperCase();
				char input_answer = input.charAt(0);
				// 4.验证用户答案，并输出结果
				if (question.check(new char[] { input_answer })) {
					System.out.println("恭喜你，答对了！");
				} else {
					System.out.println("你答错了！");
				}
		
		// 1.创建多选题
		String text1 = "1.以下说法错误的是：（多选）";
		String[] options1 = new String[4];
		options[0] = "A.Java程序的运行依赖于操作系统";
		options[1] = "B.Java是面向对象的编程语言";
		options[2] = "C.Java是面向过程的编程语言";
		options[3] = "D.Java程序的运行独立于平台";
		char[] answer1 = { 'A', 'C' };
		MultiChoice question1 = new MultiChoice(text1, options1, answer1);
		// 2.输出多选题
		System.out.println(question1.getText());
		for (String op : options) {
			System.out.print(op + "\t");
		}
		System.out.println();// 换行
		// 3.用户输入答案
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入答案：");
		String input1 = sc1.nextLine().toUpperCase();
		char[] input_answer1 = input.toCharArray();
		// 4.验证用户答案，并输出结果
		if (question1.check(input_answer1)) {
			System.out.println("恭喜你，答对了！");
		} else {
			System.out.println("你答错了！");
		}
	}

}
