package jp180202;

public class Test5 {
	//break���
	public static void main(String[] args) {
		
				int i = 1;
				int sum = 0;
				for (; i <= 100; i++) {
					sum += i;
					//sum= sum+i;
					if (sum > 1000) {
						break;
					}
				}
				System.out.println("���һ�μӺ͵���:" + i);
				System.out.println("�����:" + sum);
			
		
	}

}
