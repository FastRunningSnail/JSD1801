package me.exception;

import java.lang.instrument.IllegalClassFormatException;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("123"));
//		System.out.println(Integer.parseInt("a"));;
//		 throw new RuntimeException("����ʱ�쳣");//����ʱ�쳣�ڳ����в�Ҫ����
//		 throw new IllegalClassFormatException("�����쳣");//������ʱ�쳣ǿ��Ҫ��ʹ���߲�ȡ��ʩ
	}

}
