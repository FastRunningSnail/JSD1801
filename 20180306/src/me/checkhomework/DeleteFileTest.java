package me.checkhomework;

import java.io.File;

public class DeleteFileTest {
	// 删除D:\test
	public static void delete(File file) {
		if (file.isFile()) {// 文件
			file.delete();
			System.out.println("删除了" + file.getAbsolutePath());
		} else {// 目录
			File[] files = file.listFiles();
			if (files.length != 0) {
				for (File file2 : files) {// 遍历子目录
					delete(file2);// 递归
				}
			}
			file.delete();// 删除父目录
			System.out.println("删除了" + file.getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		delete(new File("E:\\abcd"));
	}
}

