package me.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemTest {
	public static void main(String[] args) throws IOException {
		System.out.println("�����룺");
		InputStream is = System.in;

		Scanner sc = new Scanner(is);
//		System.out.println(sc.next());// ���ո���Ϊɨ��Ľ������
//		System.out.println(sc.nextLine());// ���س�������Ϊɨ��Ľ������
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
	}
}
