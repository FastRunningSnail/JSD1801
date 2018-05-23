package me.exception;

import java.lang.instrument.IllegalClassFormatException;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("123"));
//		System.out.println(Integer.parseInt("a"));;
//		 throw new RuntimeException("运行时异常");//运行时异常在程序中不要求处理
//		 throw new IllegalClassFormatException("参数异常");//非运行时异常强制要求使用者采取措施
	}

}
