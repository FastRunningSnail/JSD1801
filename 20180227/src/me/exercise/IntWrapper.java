package me.exercise;

public class IntWrapper {
	/**
	 * int��װ��
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
		// �������õ�String����ת��Int���͵�parseInt����
		char[] array = string.toCharArray();
		// ��String���͵�stringͨ��String���µ�tocharArray����ת��char������ ����arrayװ����
		int sum = 0;
		// ��ʼ��sum��ֵΪ0
		for (int index = 0; index < array.length; index++) {
		//����һ������ֵΪindex�����indexС��array����ĳ��ȣ�����ֵ++
			int cc = (int) array[index];
			//��int����(ǿת)������array�ĵ�indexλ��ֵ��int���͵�cc
			if (cc >= 48 && (int) cc <= 57) {
			//���cc��48��57֮�䣬�Ϳ��Խ���ת��
				int temp = cc - 48;
				//cc-48Ϊ�ַ���תΪint֮���ֵ
				for (int i = 1; i <= array.length - index - 1; i++) {
					temp *= 10;
				}
				sum += temp;
			} else {
				throw new RuntimeException(new String(array) + "ת��ʧ�ܣ�");
			}
		}
		return sum;
	}
}
