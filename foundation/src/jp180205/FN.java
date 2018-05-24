package jp180205;

/**
 * 递归方法
 */

public class FN {
	/**
	 * 计算1+2+...+n的第n项
	 * 
	 * @author Administrator
	 *
	 */
	public int f(int n) {
		if (n == 1) {
			return 1;
		}
		return f(n - 1) + 1;
	}
/**
 * 计算1+3+...+n的前n项和
 * 
 * @param n
 * @return
 */
	public int sum(int n) {
		if (n == 1) {
			return f(1);
		}
		return sum(n - 1) + f(n);
	}
	
/*	public int f1(int m) {
		if (m == 2) {
			return 2;
		}
		return f1(m - 1) + 2;
	}
	public int sum2(int m) {
		if (m == 2) {
			return f1(2);
		}
		return sum2(m - 1) + f1(m);
	}*/
	
	public static void main(String[] args) {
		FN fn =new FN();
		System.out.println(fn.f(5));
		System.out.println(fn.sum(5));
		/*System.out.println(fn.f1(50));
		System.out.println(fn.sum2(50));*/
	}
	
}