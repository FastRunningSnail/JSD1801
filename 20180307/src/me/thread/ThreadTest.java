package me.thread;

/**
 * 假设输入是由一个线程执行 输入联想就是另一个线程在执行 
 * 感觉两个线程是同时在执行任务的
 * 这就是多线程的并行效果
 * 
 * @author Administrator
 *
 */
public class ThreadTest {
	public static void main(String[] args) {
		// 创建线程
		MyThread t1 = new MyThread("线程1");
		MyThread t2 = new MyThread("线程2");
		// 启动线程，进入就绪状态
		t1.start();
		t2.start();
	}
}
