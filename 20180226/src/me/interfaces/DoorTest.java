package me.interfaces;

public class DoorTest {
	public static void main(String[] args) {
		RollUpDoor r = new RollUpDoor("������");
		r.divide();
		r.alarm();

		SecurityDoor s = new SecurityDoor("������");
		s.divide();
		s.alarm();
	}

}
