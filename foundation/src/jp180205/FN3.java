package jp180205;

/**
 * 菲波那切数列的第n项
 * 
 * @author Administrator
 *
 */
public class FN3 {
	public int fbnq(int n) {
		if (n<=0){
			throw new RuntimeException("你想干嘛？n必须是正整数！");
		}

		if (n == 2) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return fbnq(n - 2) + fbnq(n - 1);
	}

	public static void main(String[] args) {
		FN3 fib = new FN3();
		System.out.println(fib.fbnq(-1));
	}
}
