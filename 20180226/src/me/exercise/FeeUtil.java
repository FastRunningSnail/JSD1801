package me.exercise;

public class FeeUtil {
	public static void fee(Season s, int count) {
		s.calcFee(count);

	}

	public static void main(String[] args) {
		fee(new Summer(),10);
		fee(new Winter(),10);
	}
}
