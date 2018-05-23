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

	// ���ļ��е���Ϣ
	public static void readFiles(String path) {
		System.out.println("���ļ�ing��");
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

	// ��д�û����ж��ļ����Ƿ��и�����¼
	public static void editUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ʺţ�");
		String username = scan.next();
		for (String key : users.keySet()) {
			if (username.equals(key)) {
				System.out.println("�ʺţ�" + key + "��" + users.get(key));
				flag = 1;
				return;
			}

		}
		// û�оͽ�����ӵ�map��
		System.out.println("�������");
		String money = scan.next();
		users.put(username, money);
	}

	// һ���Խ�map����Ϣд���ļ���
	public static void writeUsers(String path) {
		System.out.println("д�ļ�ing��");
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
