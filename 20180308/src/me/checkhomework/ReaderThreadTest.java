package me.checkhomework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ReaderThreadTest {
	public static void main(String[] args) {
	// ��������������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// ����������
		LinkedList<String> message = new LinkedList<>();
	// �������߳�
		Thread readThread = new Thread(new ReadThread(br,message));
	// �������߳�
		readThread.start();
	}	
	
}
