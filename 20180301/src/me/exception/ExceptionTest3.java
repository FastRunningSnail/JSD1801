package me.exception;

import java.lang.instrument.IllegalClassFormatException;

/**
 * �쳣����ʽ
 * 
 * @author Administrator
 *
 */
public class ExceptionTest3 {
	// �׳����쳣���ǽ��쳣�����Ϣ�������ö˴���
	public static void throwRuntime() throws RuntimeException {// �Ӳ���throws
																// ��һ������ʾĬ��
		throw new RuntimeException("ͨ��throws�ؼ����׳����쳣");
	}

	 public static void tryCatchRuntime() {
	// try{
	// throw new RuntimeException("ͨ��try-catch�鴦����쳣");
	// }catch (RuntimeException re){
	// re.printStackTrace();//��ӡ�쳣��Ϣ
	// }
	//
	 }

	private static void throwIllegal() {
		// throw new IllegalClassFormatException("ͨ��throws�ؼ����׳����쳣");
		// throw�ؼ����׳����쳣����Ҫ�ڷ������׳����쳣

	}

	public static void main(String[] args) throws RuntimeException {
		// throwRuntime();
		// throwIllegal();
		tryCatchRuntime();
		System.out.println("��ִ�У�");
	}

}
