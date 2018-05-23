package me.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) throws Exception {
		//创建服务器套接字
		ServerSocket ss =new ServerSocket(7388);
		System.out.println("Server started,waiting connection...");
		//服务器启动成功，等待客户端传来连接请求（监听客户端请求）
		Socket socket = ss.accept();
		//连接成功，开始通信
		System.out.println("new connected!");
		
		
		//获得网络输入流，接收客户端传来的信息并打印出
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("【Client:】"+br.readLine());
		//回复客户端：获得网络输出流，将信息写到输出流
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	    //写回复内容：在输出流中写回复内容
	    bw.write("Client,hello!\r\n"); 
	    bw.flush();
	}

}
