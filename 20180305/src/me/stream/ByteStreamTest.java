package me.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ֽ���
 * @author Administrator
 *
 */

public class ByteStreamTest {
	public static void main(String[] args) throws IOException {
		//�ֽ������ࣺInputStream,OutputStream
		//�ļ������������ࣺFileputStream�����ļ���,FileOutputStream(д�ļ�)
//		FileOutputStream
		//���ӣ���src/com/me/file/FileTest.java�ļ������ݶ��������У������
		File file =new File("src/me/file/FileTest.java"); //������Ŀ�ļ��Ķ���
		FileInputStream fis = new FileInputStream(file);
		//���ļ�
		int buff;
		while((buff=fis.read())!=-1){
//			System.out.print(" "+buff);
			System.out.print((char)buff);
			
			
		}
	}

}
