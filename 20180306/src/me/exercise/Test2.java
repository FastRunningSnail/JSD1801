package me.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {	private static Map<String, String> users = new HashMap<>();
private static int flag = 0;

// 一次性读文件，把信息保存到变量中（数组、集合等）
public static void readUser(String path) {
	System.out.println("读文件...");
	// 1.创建输入流
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader(path));
		// 2.读文件， 并将信息封装包map中
		String line;
		while ((line = br.readLine()) != null) {
			String[] strs = line.split(" ");
			users.put(strs[0], strs[1]);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		// 3.关闭输入流
		try {
			if (br != null)
				br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// 输入的内容在保存的集合中查找，查找到，显示
// 查找不到，添加信息，追加到集合中
public static void editUser() {
	System.out.println("正在处理...");
	// 1.输入
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入帐号：");
	String username = sc.next();
	// 2.判断
	for (String key : users.keySet()) {
		if (username.equals(key)) {
			System.out.println("帐号：" + key + "，金额：" + users.get(key));
			flag = 1;
			return;
		}
	}
	// 3.输入金额，并添加到map中
	System.out.println("请输入金额：");
	String money = sc.next();
	users.put(username, money);
}

// 一次性写文件，将集合中的信息写到文件中
public static void writeUser(String path) {
	System.out.println("写文件...");
	// 1.创建输出流
	BufferedWriter bw = null;
	try {
		bw = new BufferedWriter(new FileWriter(path));
		for (String key : users.keySet()) {
			String line = key + " " + users.get(key);
			bw.write(line);
			bw.newLine();
		}
		bw.flush();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (bw != null)
				bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public static void main(String[] args) {
	String path = "D:\\user.txt";
	// 1.将文件信息读入到map中
	readUser(path);
	// 2.根据用户输入信息，决定是否输出
	editUser();
	if (flag == 1)// 查找到用户，不需要写入操作
		return;
	// 3.将全新的集合信息写到文件
	writeUser(path);
}

}
