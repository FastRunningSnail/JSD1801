package me.interfaces;

public class DoorTest {
	public static void main(String[] args) {
		RollUpDoor r = new RollUpDoor("╬Ма╠це");
		r.divide();
		r.alarm();

		SecurityDoor s = new SecurityDoor("╥ю╣аце");
		s.divide();
		s.alarm();
	}

}
