package me.runnable;

public class RunnableTest {
	public static void main(String[] args) {
		// MyRunnable runnable1 = new MyRunnable();
		// MyRunnable runnable2 = new MyRunnable();
		//
		// runnable1.run();
		// runnable2.run();

		// Runnable�ӿ���ֻ��һ�������run����   Thread��ʵ��Runnable�ӿ�
		Runnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "�߳�1");
		Thread t2 = new Thread(runnable, "�߳�2");

		t1.start();
		t2.start();

	}

}
