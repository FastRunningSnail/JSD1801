package me.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("aam.properties");
		Properties p = new Properties();
		p.load(is);
		System.out.println("�������˺ţ�");
		Scanner sc = new Scanner(System.in);
		String account = sc.nextLine();
		String user = p.getProperty(account);
		System.out.println("���ڶ�ȡ������");

		String str = p.getProperty(account.toString());
		if(account.toString()!=user){
			System.out.println(account+"�˻����:"+" "+str);
		}
		else{
			System.out.println("�˻������ڣ��������");
			String money =sc.nextLine();
			p.setProperty(account, money);
			System.out.println("����д�롣����");
			p.store(new FileOutputStream("aam.properties"),"�˻��ͽ�������б�" );
			
//		p = System.getProperties();
			p.list(System.out);
		}
	}

}
