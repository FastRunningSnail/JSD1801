package me.interfaces;

public class RollUpDoor extends Door implements Alarm{

	
	public RollUpDoor() {
	}

	public RollUpDoor(String type) {
		super(type);
		
	}

	@Override
	public void divide() {
		System.out.println(getType()+"�����������������Ŀռ�ģ�");

	}

	@Override
	public void alarm() {
		System.out.println(getType()+"����������");
	}

}
