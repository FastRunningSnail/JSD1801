package me.checkhomework;

import java.io.BufferedReader;
import java.util.LinkedList;

public class ReadThread implements Runnable{
	private BufferedReader br;
	private LinkedList<String> message;
	public ReadThread(BufferedReader br, LinkedList<String> message) {
		super();
		this.br = br;
		this.message = message;
	}
	@Override
	public void run() {
		try {System.out.println("读线程开始。。。");
		while(true){
			System.out.println("请输入内容：");
			String line = br.readLine();
			System.out.println("正在读。。。");
			message.add(line);
			if(line.equals("quit")){
				break;
			}
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {if(br != null){
				br.close();
			}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				System.out.println("读线程结束。。。");
			}
		}
	}
	

}
