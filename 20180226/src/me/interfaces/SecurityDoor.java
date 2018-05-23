package me.interfaces;

public class SecurityDoor extends Door implements Alarm{
	

	public SecurityDoor() {
		super();
		
	}

	public SecurityDoor(String type) {
		super(type);
		
	}

	@Override
	public void divide() {
		System.out.println(getType()+"����ռ䣡");
	}

	@Override
	public void alarm() {
		System.out.println(getType()+"������");
		
	}

}
