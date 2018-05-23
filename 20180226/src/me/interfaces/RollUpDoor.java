package me.interfaces;

public class RollUpDoor extends Door implements Alarm{

	
	public RollUpDoor() {
	}

	public RollUpDoor(String type) {
		super(type);
		
	}

	@Override
	public void divide() {
		System.out.println(getType()+"是用来间隔室内室外的空间的！");

	}

	@Override
	public void alarm() {
		System.out.println(getType()+"发生警报！");
	}

}
