package me.exception;

public class ExceptionTest {
	public static void main(String[] args) throws Throwable {
		// 认识异常
		// System.out.println(1 / 0);
		// 1.异常在java中使用异常类描述
		// 2.异常信息包含了一些简单的字符串，直观描述异常的错误类型
		// 3.异常信息中还包含了发生异常的错误点

		// 异常分类：运行时异常，非运行时异常
		// ArithmeticException称为算数异常，继承了RuntimeException类
		// RuntimeException称为运行时异常类，继承Exception类
		// Exception称为异常类，继承了Throwable类
		// Throwable类是异常的顶层类
		// Integer.parseInt("abc");
		// NumberFormatException称为数字格式化异常，继承RuntimeException类

//		Throwable t = new Throwable("测试异常信息");
//		try {
//			throw t;
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Throwable t = new Throwable("测试异常信息");
		throw t;//throw关键字处理异常的两种方式，一种往上抛，一种try-catch块方法处理
	}

}
