package me.homework;

import java.util.Scanner;

public class QusetionTest {
	public static void main(String[] args) {
		Question[] ques =new Question[2];
		ques[0] =new SingleChoice("2和3的积是多少",new String[]{"A:4","B:6","C:8","D:10"},'B');
		ques[1] = new MultiChoice("以下哪些是水果？",new String[]{"A:苹果","B:猪肉","C:米饭","D:杨桃"},new char[]{'A','D'});
		for(int i=0;i<ques.length;i++){
			Question q =ques[i];
			q.print();
			Scanner scan =new Scanner(System.in);
			String a = scan.nextLine();
			char[]answers=a.toCharArray();
			System.out.println("您的答案是：");
			if(q.check(answers)){
				System.out.println("回答正确！");
			}
			else{
				System.out.println("回答错误！");
			}
		}
	}

}
