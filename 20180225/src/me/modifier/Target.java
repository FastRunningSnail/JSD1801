package me.modifier;

public class Target {
	private String m_private="private";
	String m_default = "default";
	protected String m_protected = "protected";
	public String m_public ="public";
	
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.m_private);
		System.out.println(target.m_default);
		System.out.println(target.m_protected);
		System.out.println(target.m_public);
	}

}
