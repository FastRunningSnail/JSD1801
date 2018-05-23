package me.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) throws Exception {
		//�����������׽���
		ServerSocket ss =new ServerSocket(7388);
		System.out.println("Server started,waiting connection...");
		//�����������ɹ����ȴ��ͻ��˴����������󣨼����ͻ�������
		Socket socket = ss.accept();
		//���ӳɹ�����ʼͨ��
		System.out.println("new connected!");
		
		
		//������������������տͻ��˴�������Ϣ����ӡ��
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("��Client:��"+br.readLine());
		//�ظ��ͻ��ˣ�������������������Ϣд�������
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	    //д�ظ����ݣ����������д�ظ�����
	    bw.write("Client,hello!\r\n"); 
	    bw.flush();
	}

}
