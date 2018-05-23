package me.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1KB= 1024byte;1byte=8bit(����/λ);һ��������2byte��Ӣ������ĸ���ַ���1byte��
 * @author Administrator
 *
 */

public class BufferedStreamTest {
	public static void copyFileByByteStream(String src,String dest) throws Exception{
		//����������
		InputStream is =new FileInputStream(src);
		//��������������
		BufferedInputStream bis = new BufferedInputStream(is);
		//���������
		OutputStream os = new FileOutputStream(dest);
		//�������������
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
