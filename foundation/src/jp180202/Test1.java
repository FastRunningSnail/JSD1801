package jp180202;
//��1-100��ż����
public class Test1 {
	public static void main(String[] args) {
		// ����ѭ������
		int i = 1;
		// ������
		int sum = 0;// ������
		// ѭ������
		for (; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		// ���ż����
		System.out.println("1-100��ż����=" + sum);
		
		// ������
		int j =0;
		int sum2=0;
		for(; j <= 100; j=j+2){
//			System.out.println(j);
			sum2+=j;
		}
		System.out.println("1-100��ż����=" + sum2);
		
	}
}




