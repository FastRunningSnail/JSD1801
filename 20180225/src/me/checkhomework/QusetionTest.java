package me.checkhomework;

import java.util.Scanner;

public class QusetionTest {
	public static void main(String[] args) {
		// 1.������ѡ��
				String text = "1.�����ľ�ʫ��\"���κ�����\"���ϰ�䣿";
				String[] options = new String[4];
				options[0] = "A.����������";
				options[1] = "B.˭֪���в�";
				options[2] = "C.�����յ���";
				options[3] = "D.��ǰ���¹�";
				char answer = 'C';
				SingleChoice question = new SingleChoice(text, options, answer);
				// 2.�����ѡ��
				System.out.println(question.getText());
				for (String op : options) {
					System.out.print(op + "\t");
				}
				System.out.println();// ����
				// 3.�û������
				Scanner sc = new Scanner(System.in);
				System.out.println("������𰸣�");
				String input = sc.nextLine().toUpperCase();
				char input_answer = input.charAt(0);
				// 4.��֤�û��𰸣���������
				if (question.check(new char[] { input_answer })) {
					System.out.println("��ϲ�㣬����ˣ�");
				} else {
					System.out.println("�����ˣ�");
				}
		
		// 1.������ѡ��
		String text1 = "1.����˵��������ǣ�����ѡ��";
		String[] options1 = new String[4];
		options[0] = "A.Java��������������ڲ���ϵͳ";
		options[1] = "B.Java���������ı������";
		options[2] = "C.Java��������̵ı������";
		options[3] = "D.Java��������ж�����ƽ̨";
		char[] answer1 = { 'A', 'C' };
		MultiChoice question1 = new MultiChoice(text1, options1, answer1);
		// 2.�����ѡ��
		System.out.println(question1.getText());
		for (String op : options) {
			System.out.print(op + "\t");
		}
		System.out.println();// ����
		// 3.�û������
		Scanner sc1 = new Scanner(System.in);
		System.out.println("������𰸣�");
		String input1 = sc1.nextLine().toUpperCase();
		char[] input_answer1 = input.toCharArray();
		// 4.��֤�û��𰸣���������
		if (question1.check(input_answer1)) {
			System.out.println("��ϲ�㣬����ˣ�");
		} else {
			System.out.println("�����ˣ�");
		}
	}

}
