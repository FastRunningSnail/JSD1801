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
		try {System.out.println("���߳̿�ʼ������");
		while(true){
			System.out.println("���������ݣ�");
			String line = br.readLine();
			System.out.println("���ڶ�������");
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
				System.out.println("���߳̽���������");
			}
		}
	}
	

}
