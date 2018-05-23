package me.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.3.50", 7388);
		//��������������������Ϣд�������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("Hello,Server!\r\n");
		bw.flush();
		//������������������շ������Ϣ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("��Server��:"+br.readLine());
		

	}
}
