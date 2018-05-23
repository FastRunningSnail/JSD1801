package me.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.3.50", 7388);
		//获得网络输出流，并将信息写到输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("Hello,Server!\r\n");
		bw.flush();
		//获得网络输入流，接收服务端信息并输出
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("【Server】:"+br.readLine());
		

	}
}
