package me.exercise2;

public class MulticolourPrinter extends Printer{

	public MulticolourPrinter() {
		super();
		
	}

	public MulticolourPrinter(String name) {
		super(name);
		
	}
	
	public void afterClickPrint(){
		System.out.println(getName()+"´òÓ¡²ÊÉ«Ö½ÕÅ");
	}

}
