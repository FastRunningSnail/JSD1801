package me.hashset;

public class UserTest {
//	private float a=3.14F; //float��  ������
//	private char c = 'a';//�ַ��� ������
//	private byte b = 1;  //�ֽ���
	public static void main(String[] args) {
		Userinfo u1 = new Userinfo(1,"����");
		Userinfo u2 = new Userinfo(2,"����");
		Userinfo u3 = new Userinfo(1,"����");
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
	}

}
