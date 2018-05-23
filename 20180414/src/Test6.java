import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一串数字，用都好隔开每一个数字");
		String input=sc.nextLine();
		String[] nums = input.split(",");
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
