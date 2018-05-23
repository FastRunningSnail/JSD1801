package me.exercise2;

public class DoubleWrapperTest {
	public static void main(String[] args) {
		DoubleWrapper num123 = new DoubleWrapper(123);
		System.out.println(num123.getValue());
//		num123 = new DoubleWrapper("123");
		System.out.println(num123.getValue()/4);
		System.out.println(Double.parseDouble("123.123"));
		System.out.println(Double.valueOf("123.123"));
	}

}
