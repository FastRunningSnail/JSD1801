package me.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamTest {
	// char c = '中';
	public static void copyFileByCharStream(String src, String dest) throws IOException {
		// 创建文件字符输入流
		Reader reader = new FileReader(src);
		// 创建文件字符缓冲输入流
		BufferedReader br = new BufferedReader(reader);
		//创建文件字符输出流
		Writer writer = new FileWriter(dest);
		//创建文件字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(writer);
		char [] buffer = new char[512];
		int length;
        while((length = br.read(buffer))!=-1){
        	bw.write(buffer, 0, length);
        }
        bw.flush();
        bw.close();
        br.close();
	}
	public static void main(String[] args) throws IOException {
		copyFileByCharStream("D:\\JSD1801\\liujunpeng\\workspace\\20180306\\src\\me\\io\\BufferedStreamTest.java","bis.java");
	}
}
