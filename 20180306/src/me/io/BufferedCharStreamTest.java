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
	// char c = '��';
	public static void copyFileByCharStream(String src, String dest) throws IOException {
		// �����ļ��ַ�������
		Reader reader = new FileReader(src);
		// �����ļ��ַ�����������
		BufferedReader br = new BufferedReader(reader);
		//�����ļ��ַ������
		Writer writer = new FileWriter(dest);
		//�����ļ��ַ����������
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
