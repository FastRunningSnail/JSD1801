package jp180203;

public class ConditionTest3 {
	public static void main(String[] args) {
		// �����ֶ�ͳ�ƣ�0-59.5������60-79.5����80-89.5���ã�90-100���㣬�����ɼ���Ϊ������ɼ�
		double score = 8;
		if (score >= 0 && score <= 59.5)
			System.out.println("������");
		else if (score >= 60 && score <= 79.5)
			System.out.println("����");
		else if (score >= 80 && score <= 89.5)
			System.out.println("���ã�");
		else if (score >= 90 && score <= 100)
			System.out.println("���㣡");
		else {
			System.out.println("�ɼ�������");
		}

	}

}
