package jp180202;

public class Test5 {
	//break语句
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
				System.out.println("最后一次加和的数:" + i);
				System.out.println("最后结果:" + sum);
			
		
	}

}
