package me.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1KB= 1024byte;1byte=8bit(比特/位);一个中文字2byte，英文字字母数字符号1byte。
 * @author Administrator
 *
 */

public class BufferedStreamTest {
	public static void copyFileByByteStream(String src,String dest) throws Exception{
		//创建输入流
		InputStream is =new FileInputStream(src);
		//创建缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(is);
		//创建输出流
		OutputStream os = new FileOutputStream(dest);
		//创建缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] buffer = new byte[1024];
		int length;
		while((length =bis.read(buffer))!=-1){
			bos.write(buffer, 0, length);
		}
		bos.flush();
		bos.close();
		bis.close();
	}
	public static void main(String[] args) throws Exception {
		copyFileByByteStream("D:\\JSD1801\\liujunpeng\\workspace\\20180306\\src\\me\\io\\BufferedStreamTest.java", "bst1.java");
//		System.out.println(sizeof(8));
		copyFileByByteStream("D:\\qycache\\livenet_cloudcfg.ini", "aiqiyi.txt");
	}
	

}
