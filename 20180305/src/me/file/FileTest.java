package me.file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("D:\\");//表示盘符
		File file2 = new File("D:\\JSD1801");//表示文件夹
		File file3 = new File("D:\\Received\\Day1.txt"); //表示文件
		System.out.println(file3.exists());
		
		System.out.println(file2.getParent());
		
		
		File f2 =new File("D:\\JSD1801");
		f2.mkdirs();
		
		
	}

}
