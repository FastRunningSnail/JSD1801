package me.checkhomework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws Exception {
		//1.实现键盘录入账号
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入账号：");
		String username = br.readLine();
		
		//2.读取properties文件， 生成属性列表对象
		Properties properties = new Properties();
		properties.load(new FileInputStream("user.properties"));
		
		if(properties.get(username)==null){
			System.out.println("账户不存在，请输入金额：");
			String money = br.readLine(); //
			System.out.println("正在写入文件。。。");
			properties.setProperty(username, money);
			System.out.println("写入成功！");
			properties.store(new FileOutputStream("user.properties"), "新的属性列表");
			
		}else{
			System.out.println(username+" "+"账户余额:"+properties.getProperty(username));
		}
		
	}

}
