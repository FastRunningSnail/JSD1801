package me.exercise;

public class IntWrapper {
	/**
	 * int包装类
	 * 
	 * @author Administrator
	 *
	 */
	private int value;

	public IntWrapper() {
	}

	public IntWrapper(int value) {
		super();
		this.value = value;
	}

	public IntWrapper(String value) {
		super();
		this.value = parseInt(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static int parseInt(String string) {
		// 创建将得到String类型转成Int类型的parseInt方法
		char[] array = string.toCharArray();
		// 将String类型的string通过String底下的tocharArray方法转成char型数组 并用array装起来
		int sum = 0;
		// 初始化sum的值为0
		for (int index = 0; index < array.length; index++) {
		//引入一个索引值为index，如果index小于array数组的长度，索引值++
			int cc = (int) array[index];
			//将int类型(强转)的数组array的第index位赋值给int类型的cc
			if (cc >= 48 && (int) cc <= 57) {
			//如果cc在48到57之间，就可以进行转换
				int temp = cc - 48;
				//cc-48为字符串转为int之后的值
				for (int i = 1; i <= array.length - index - 1; i++) {
					temp *= 10;
				}
				sum += temp;
			} else {
				throw new RuntimeException(new String(array) + "转换失败！");
			}
		}
		return sum;
	}
}
