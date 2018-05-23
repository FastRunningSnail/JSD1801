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
		System.out.println(getType()+"¸ôÀë¿Õ¼ä£¡");
	}

	@Override
	public void alarm() {
		System.out.println(getType()+"¾¯±¨£¡");
		
	}

}
