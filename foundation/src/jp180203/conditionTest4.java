package jp180203;

public class conditionTest4 {
	public static void main(String[] args) {
		// 3-5������6-8�ļ���9-11�＾��12-2����
		// �����·� ��������
		int month = 1;

		if (month == 3 || month == 4 || month == 5) {
			System.out.println("����");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("�ļ�");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("�＾");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("����");
		}

	}

}
