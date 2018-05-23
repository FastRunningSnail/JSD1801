package me.checkhomework;

public class Mouse extends Peripheral implements USB,PS2{

	public Mouse() {
		super();
		
	}

	public Mouse(String name) {
		super(name);
		
	}
	
	@Override
	public void connectByUSB(){
		System.out.println(getName()+"通过USB连接PC！");
	}
	
	@Override
	public void connectByPS2(){
		System.out.println(getName()+"通过PS2连接PC！");
	}
	


}
