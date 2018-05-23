package me.exercise2;

public class Printer {
	private String name;

	public Printer() {
		super();
		
	}

	public Printer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + "]";
	}
	
	/**
	 * ¥Ú”°∑Ω∑®
	 */
	public void afterClickPrint(){
		
	}

}
