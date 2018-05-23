package me.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {
	// 输入一个数字，加上100后，用1000除以该数，输出结果
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		try {
			int input = sc.nextInt();// java.util.InputMismatchException输入不匹配异常
			if (input < 0) {
				if (input == -100) {
					throw new ArithmeticException("除数不可以为0");

				} else {
					throw new Exception("不可以输入负数!");
				}

			}
			System.out.println("最后结果：" + 1000 / (input + 100));

			try {
				throw new Exception("不可以输入负数!");
			} catch (Exception e) {
				System.err.println("异常信息：" + e.getMessage());
			}

		} catch (InputMismatchException ime) {
			System.err.println("异常信息：" + ime.getMessage());
		} catch (ArithmeticException ae) {
			System.err.println("异常信息：" + ae.getMessage());
		} catch (Exception e) {
			 e = new Exception("不可以输入负数!");
			 e = new InputMismatchException("不匹配");
			System.err.println("异常信息：" + e.getMessage());
		} finally {// 无论是否发生异常，都执行的语句
			System.out.println("try-catch块结束...");
		}
		System.out.println("程序运行结束...");
	}

}
