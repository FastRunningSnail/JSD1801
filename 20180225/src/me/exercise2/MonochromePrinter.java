package me.exercise2;

public class MonochromePrinter extends Printer {

	public MonochromePrinter() {
		super();

	}

	public MonochromePrinter(String name) {
		super(name);

	}

	public void afterClickPrint() {
		System.out.println(getName()+"´òÓ¡ºÚ°×Ö½ÕÅ");

	}

}
