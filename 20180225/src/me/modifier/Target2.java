package me.modifier;

public class Target2 {
public static void main(String[] args) {
	Target target = new Target();
//	System.out.println(target.m_private);//����ͬһ���е����������
	System.out.println(target.m_default);
	System.out.println(target.m_protected);
	System.out.println(target.m_public);
}
}
