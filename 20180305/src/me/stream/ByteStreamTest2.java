package me.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ֽ���
 * @author Administrator
 *
 */

public class ByteStreamTest2 {
	/**��src/me/file/FileTest.java���ļ����ݿ�����src/me/file/FileTest.java_copy.txt��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("src/me/file/FileTest.java");
		FileInputStream fis =new FileInputStream(f);
		int buff;
		while ((buff = fis.read())!=-1){
			System.out.print((char)buff);
		}
		fis.close();
		
		File f2 = new File("src/me/file/FileTest.java_copy.txt");
		FileOutputStream fos = new FileOutputStream(f2);
		for(int i=0;i<f.length();i++){
			fos.write(i);;
		}
		fos.flush();
		fos.close();
//		System.out.println(f);
//		System.out.println(f2);
	}

}
