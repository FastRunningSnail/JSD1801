package me.checkhomework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
		//1.ʵ�ּ���¼���˺�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������˺ţ�");
		String username = br.readLine();
		
		//2.��ȡproperties�ļ��� ���������б����
		Properties properties = new Properties();
		properties.load(new FileInputStream("user.properties"));
		
		if(properties.get(username)==null){
			System.out.println("�˻������ڣ��������");
			String money = br.readLine(); //
			System.out.println("����д���ļ�������");
			properties.setProperty(username, money);
			System.out.println("д��ɹ���");
			properties.store(new FileOutputStream("user.properties"), "�µ������б�");
			
		}else{
			System.out.println(username+" "+"�˻����:"+properties.getProperty(username));
		}
		
	}

}
