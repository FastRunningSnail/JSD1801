package me.homework;

import java.util.Scanner;

public class QusetionTest {
	public static void main(String[] args) {
		Question[] ques =new Question[2];
		ques[0] =new SingleChoice("2��3�Ļ��Ƕ���",new String[]{"A:4","B:6","C:8","D:10"},'B');
		ques[1] = new MultiChoice("������Щ��ˮ����",new String[]{"A:ƻ��","B:����","C:�׷�","D:����"},new char[]{'A','D'});
		for(int i=0;i<ques.length;i++){
			Question q =ques[i];
			q.print();
			Scanner scan =new Scanner(System.in);
			String a = scan.nextLine();
			char[]answers=a.toCharArray();
			System.out.println("���Ĵ��ǣ�");
			if(q.check(answers)){
				System.out.println("�ش���ȷ��");
			}
			else{
				System.out.println("�ش����");
			}
		}
	}

}
