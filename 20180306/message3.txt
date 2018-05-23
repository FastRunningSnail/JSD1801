package me.checkhomework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTest {
	public static void copyFileByByteStream(String src, String dest) throws Exception {
		// 1.创建输入流
		InputStream is = new FileInputStream(src);
		// 2.创建输出流
		OutputStream os = new FileOutputStream(dest);
		// 3.读文件
		byte[] buffer = new byte[1024];// 缓冲区
		int length;// 记录每次读取的长度
		while ((length = is.read(buffer)) != -1) {
			// 4.写文件
			os.write(buffer, 0, length);
		}
		os.flush();// 刷新输出流
		os.close();
		is.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByByteStream("D:\\qycache\\file.txt", "message.txt");
	}
}
