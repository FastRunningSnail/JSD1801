package me.checkhomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ReadAndWriteTest {
	public static void main(String[] args) throws Exception {
        // 1.����������
        LinkedList<String> message = new LinkedList<>();
        // 2.�������������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("message.txt"));
        // 3.������������߳�
        Thread readThread = new Thread(new ReadThread(br, message));
        Thread writeThread = new Thread(new WriteThread(bw, message));
        // 4.������������߳�
        readThread.start();
        writeThread.start();
    }

}
