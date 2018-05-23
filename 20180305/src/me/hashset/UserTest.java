package me.hashset;

public class UserTest {
//	private float a=3.14F; //float型  单精度
//	private char c = 'a';//字符型 单引号
//	private byte b = 1;  //字节型
	public static void main(String[] args) {
		Userinfo u1 = new Userinfo(1,"张三");
		Userinfo u2 = new Userinfo(2,"李四");
		Userinfo u3 = new Userinfo(1,"张三");
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
	}

}
