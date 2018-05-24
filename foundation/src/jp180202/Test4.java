package jp180202;
/**
 * 计算1-100的和，55 不纳入计算
 * 
 * @author Administrator
 *
 */
public class Test4 {
	// continue循环
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
				j++;// 不应被跳过的代码，在此处补充
				continue;
			}
			sum2 += j;
			j++;
		}
		System.out.println("除55以外的和为"+sum2);
	}

}
