package me.file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("D:\\");//��ʾ�̷�
		File file2 = new File("D:\\JSD1801");//��ʾ�ļ���
		File file3 = new File("D:\\Received\\Day1.txt"); //��ʾ�ļ�
		System.out.println(file3.exists());
		
		System.out.println(file2.getParent());
		
		
		File f2 =new File("D:\\JSD1801");
		f2.mkdirs();
		
		
	}

}
