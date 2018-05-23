package me.exercise2;

public class DoubleWrapper {
	private double value;

	public DoubleWrapper() {
	}

	public DoubleWrapper(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public static double parseDouble(char cha) {
		return cha;
	}

	/*
	 * @Override public String toString() { return "DoubleWrapper [value=" +
	 * value + ", getValue()=" + getValue() + ", getClass()=" + getClass() +
	 * ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	 * }
	 */

	/*
	 * public static void main(String[] args) { double d =
	 * Double.parseDouble("11"); System.out.println(d); }
	 */
	public static double parseDouble(String string) {
		char[] array = string.toCharArray();
		double sum = 0;
		for (double index = 0; index < array.length; index++) {
			double cc = (double) array[(int) index];
			if (cc >= 48 && (double) cc <= 57) {
				double temp = cc - 48;
				for (double i = 1; i <= array.length - index - 1; i++) {
					temp *= 0.01;
				}
				sum += temp;
			} else {
				throw new RuntimeException(new String(array) + "×ª»»Ê§°Ü£¡");
			}
		}
		return sum;

	}

}
