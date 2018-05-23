package me.exercise;

public class IntWrapperTest {
	public static void main(String[] args) {
		IntWrapper num123 = new IntWrapper(123);
		System.out.println(num123.getValue());
		num123 = new IntWrapper("123");
//		String str = "123";'1'-->1;
		System.out.println(num123.getValue()/4);
	}

}
