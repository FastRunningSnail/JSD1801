package jp180202;
//求1-100的和
public class Test {
	public static void main(String[] args) {

		int i = 1;
		int sum =0;

		for (; i <= 100;i++) {
			sum+=i;
		}
		
		System.out.println("1-100的和为"+sum);
		
		int j = 1;
		int sum2 =0;

		for (; j <= 100;) {
			sum2+=j;
			j++;
		}
		
		System.out.println("1-100的和为"+sum2);
	}

}
