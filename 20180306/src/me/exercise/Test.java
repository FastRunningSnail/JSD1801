package me.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");   //�����ļ�����
		if (!file.exists())                  //�жϸ��ļ��Ƿ���ڣ�����������򴴽����ļ�
		{
		    file.createNewFile();
		}
		System.out.println("�������˺ţ�");
		FileWriter fr = new FileWriter(file);   //����ļ����󴴽��ļ�д��������
		BufferedWriter bw = new BufferedWriter(fr);   //Ϊ�ļ�д��������������
		//������̨�������ת�����ַ�����������������
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		String str = bin.readLine();    //���մӿ���̨�����һ���ַ���
		System.out.println("�������");
		while (!(str.equals("!!!")))    //�������"!!!"������������
		{
		    bw.write(str);              //���ӿ���̨������ַ���д�뵽�ļ���
		    bw.newLine();               //������
		    str = bin.readLine();       //�ٴӿ���̨��������
		}
		//�ر������Ѿ��򿪵���
		bw.close();
		fr.close();
		bin.close();
	}

}
