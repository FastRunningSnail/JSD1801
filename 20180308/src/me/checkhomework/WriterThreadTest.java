package me.checkhomework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;

public class WriterThreadTest {
	public static void main(String[] args) throws Exception {
		// 创建键盘输入流
			BufferedWriter bw = new BufferedWriter(new FileWriter("message.txt"));
		// 创建缓冲区
			LinkedList<String> message = new LinkedList<>();
		// 创建读线程
			Thread writeThread = new Thread(new WriteThread(bw,message));
		// 启动读线程
			writeThread.start();
		}	
	

}
