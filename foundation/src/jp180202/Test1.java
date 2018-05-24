package jp180202;
//求1-100的偶数和
public class Test1 {
	public static void main(String[] args) {
		// 定义循环变量
		int i = 1;
		// 保存结果
		int sum = 0;// 保存结果
		// 循环过程
		for (; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		// 输出偶数和
		System.out.println("1-100的偶数和=" + sum);
		
		// 方法二
		int j =0;
		int sum2=0;
		for(; j <= 100; j=j+2){
//			System.out.println(j);
			sum2+=j;
		}
		System.out.println("1-100的偶数和=" + sum2);
		
	}
}




