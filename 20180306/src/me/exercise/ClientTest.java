package me.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientTest {
	private static Map<String, String> users = new HashMap<>();
	private static int flag = 0;

	// 读文件中的信息
	public static void readFiles(String path) {
		System.out.println("读文件ing！");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				String[] strs = line.split(" ");
				users.put(strs[0], strs[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 填写用户并判断文件中是否含有该条记录
	public static void editUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入帐号：");
		String username = scan.next();
		for (String key : users.keySet()) {
			if (username.equals(key)) {
				System.out.println("帐号：" + key + "金额：" + users.get(key));
				flag = 1;
				return;
			}

		}
		// 没有就将其添加到map中
		System.out.println("请输入金额：");
		String money = scan.next();
		users.put(username, money);
	}

	// 一次性将map中信息写到文件中
	public static void writeUsers(String path) {
		System.out.println("写文件ing！");
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
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// File file = new File("user_info.txt");
		String path = "user_info.txt";
		readFiles(path);
		editUser();
		if (flag != 1) {
			writeUsers(path);
		}
	}
}
