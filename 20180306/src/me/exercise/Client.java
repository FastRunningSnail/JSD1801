package me.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	/**
	 * 提示用户输入账号，如果当前该账号不存在则创建，提示输入金额，然后 把账号和金额保存到 文件中，如账号存在则把金额显示出来。
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr =null;
		try {
			fr = new FileReader("input.txt");
			// 调用read方法输出到控制台上
			int len = 0;
			try {
				while ((len = fr.read()) != -1) {
					System.out.print((char) len);

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File file = new File("clientinfo.txt"); // 创建保存输入信息的文件
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println("请输入帐号：");

		FileWriter fw = new FileWriter(file); // 创建文件输入流
		BufferedWriter bw = new BufferedWriter(fw); // 创建缓冲输入流
		// 创建缓冲区读取输入信息
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("请输入金额：");

		while (!(str.equals("stop"))) { // equals是判断内容是否相同，"=="判断两物是否相同
			bw.write(str);
			bw.newLine();
			str = br.readLine();
		}
		bw.close();
		fw.close();
		br.close();
	}

}
