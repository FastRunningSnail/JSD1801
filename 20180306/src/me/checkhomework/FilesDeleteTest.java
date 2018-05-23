package me.checkhomework;

import java.io.File;

public class FilesDeleteTest {
	public static void filesDelete(File file) {
		if (file.isFile()) {
			file.delete();
			System.out.println("É¾³ýÁË" + file.getAbsolutePath());
		} else {
			File[] files = file.listFiles();
			if (files.length != 0) {
				for (File file2 : files) {
					filesDelete(file2);
				}
			}
			file.delete();
			System.out.println("É¾³ýÁË" + file.getAbsolutePath());
		}
	}
	
	public static void main(String[] args) {
		filesDelete(new File("E:\\asdf"));
	}

}
