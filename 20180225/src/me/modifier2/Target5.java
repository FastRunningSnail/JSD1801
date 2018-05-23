package me.modifier2;

import me.modifier.Target;

public class Target5 extends Target{
	public static void main(String[] args) {
		Target5 targetson = new Target5();
		/*System.out.println(targetson.m_private);
		System.out.println(targetson.m_default);*/
		System.out.println(targetson.m_protected);
		System.out.println(targetson.m_public);
	}
}
