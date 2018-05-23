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
	 * ��ʾ�û������˺ţ������ǰ���˺Ų������򴴽�����ʾ�����Ȼ�� ���˺źͽ��浽 �ļ��У����˺Ŵ�����ѽ����ʾ������
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr =null;
		try {
			fr = new FileReader("input.txt");
			// ����read�������������̨��
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

		File file = new File("clientinfo.txt"); // ��������������Ϣ���ļ�
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println("�������ʺţ�");

		FileWriter fw = new FileWriter(file); // �����ļ�������
		BufferedWriter bw = new BufferedWriter(fw); // ��������������
		// ������������ȡ������Ϣ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("�������");

		while (!(str.equals("stop"))) { // equals���ж������Ƿ���ͬ��"=="�ж������Ƿ���ͬ
			bw.write(str);
			bw.newLine();
			str = br.readLine();
		}
		bw.close();
		fw.close();
		br.close();
	}

}
