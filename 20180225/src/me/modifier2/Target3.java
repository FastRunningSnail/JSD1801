package me.modifier2;

import me.modifier.Target;

public class Target3 {
	public static void main(String[] args) {
		Target target = new Target();
//		System.out.println(target.m_private);//不被不同包中的其他类访问
//		System.out.println(target.m_default);//不被不同包中的其他类访问
//		System.out.println(target.m_protected);//不被不同包中的其他类访问
		System.out.println(target.m_public);
	}

}
