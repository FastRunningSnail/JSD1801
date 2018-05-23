package me.runnable;

public class RunnableTest {
	public static void main(String[] args) {
		// MyRunnable runnable1 = new MyRunnable();
		// MyRunnable runnable2 = new MyRunnable();
		//
		// runnable1.run();
		// runnable2.run();

		// Runnable接口中只有一个抽象的run方法   Thread类实现Runnable接口
		Runnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "线程1");
		Thread t2 = new Thread(runnable, "线程2");

		t1.start();
		t2.start();

	}

}
