import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ�����֣��ö��ø���ÿһ������");
		String input=sc.nextLine();
		String[] nums = input.split(",");
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
