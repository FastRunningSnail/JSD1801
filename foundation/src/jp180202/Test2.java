package jp180202;

public class Test2 {
	// 求1-100的奇数和
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println("1-100的奇数和="+sum);
	}

}
