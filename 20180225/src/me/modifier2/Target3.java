package me.modifier2;

import me.modifier.Target;

public class Target3 {
	public static void main(String[] args) {
		Target target = new Target();
//		System.out.println(target.m_private);//������ͬ���е����������
//		System.out.println(target.m_default);//������ͬ���е����������
//		System.out.println(target.m_protected);//������ͬ���е����������
		System.out.println(target.m_public);
	}

}
