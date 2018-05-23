package me.exception;

import java.lang.instrument.IllegalClassFormatException;

/**
 * 异常处理方式
 * 
 * @author Administrator
 *
 */
public class ExceptionTest3 {
	// 抛出的异常，是将异常相关信息交给调用端处理
	public static void throwRuntime() throws RuntimeException {// 加不加throws
																// 都一样，表示默认
		throw new RuntimeException("通过throws关键字抛出的异常");
	}

	 public static void tryCatchRuntime() {
	// try{
	// throw new RuntimeException("通过try-catch块处理的异常");
	// }catch (RuntimeException re){
	// re.printStackTrace();//打印异常信息
	// }
	//
	 }

	private static void throwIllegal() {
		// throw new IllegalClassFormatException("通过throws关键字抛出的异常");
		// throw关键字抛出的异常必须要在方法上抛出的异常

	}

	public static void main(String[] args) throws RuntimeException {
		// throwRuntime();
		// throwIllegal();
		tryCatchRuntime();
		System.out.println("能执行？");
	}

}
