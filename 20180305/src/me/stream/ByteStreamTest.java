package me.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节流
 * @author Administrator
 *
 */

public class ByteStreamTest {
	public static void main(String[] args) throws IOException {
		//字节流超类：InputStream,OutputStream
		//文件流操作，子类：FileputStream（读文件）,FileOutputStream(写文件)
//		FileOutputStream
		//例子：将src/com/me/file/FileTest.java文件的内容读到程序中，并输出
		File file =new File("src/me/file/FileTest.java"); //创建项目文件的对象
		FileInputStream fis = new FileInputStream(file);
		//读文件
		int buff;
		while((buff=fis.read())!=-1){
//			System.out.print(" "+buff);
			System.out.print((char)buff);
			
			
		}
	}

}
