package jp180202;
/**
 * ����1-100�ĺͣ�55 ���������
 * 
 * @author Administrator
 *
 */
public class Test4 {
	// continueѭ��
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for (; i <= 100; i++) {
			if (i == 55) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);

		int j = 1;
		int sum2 = 0;
		while (j <= 100) {
			if (j == 55) {
				j++;// ��Ӧ�������Ĵ��룬�ڴ˴�����
				continue;
			}
			sum2 += j;
			j++;
		}
		System.out.println("��55����ĺ�Ϊ"+sum2);
	}

}
