package me.checkhomework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;

public class WriterThreadTest {
	public static void main(String[] args) throws Exception {
		// ��������������
			BufferedWriter bw = new BufferedWriter(new FileWriter("message.txt"));
		// ����������
			LinkedList<String> message = new LinkedList<>();
		// �������߳�
			Thread writeThread = new Thread(new WriteThread(bw,message));
		// �������߳�
			writeThread.start();
		}	
	

}
