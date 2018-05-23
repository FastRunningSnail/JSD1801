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
		System.out.println("请输入账号：");
		Scanner sc = new Scanner(System.in);
		String account = sc.nextLine();
		String user = p.getProperty(account);
		System.out.println("正在读取。。。");

		String str = p.getProperty(account.toString());
		if(account.toString()!=user){
			System.out.println(account+"账户金额:"+" "+str);
		}
		else{
			System.out.println("账户不存在，请输入金额：");
			String money =sc.nextLine();
			p.setProperty(account, money);
			System.out.println("正在写入。。。");
			p.store(new FileOutputStream("aam.properties"),"账户和金额属性列表" );
			
//		p = System.getProperties();
			p.list(System.out);
		}
	}

}
