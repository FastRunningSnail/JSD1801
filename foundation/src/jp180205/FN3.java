package jp180205;

/**
 * �Ʋ��������еĵ�n��
 * 
 * @author Administrator
 *
 */
public class FN3 {
	public int fbnq(int n) {
		if (n<=0){
			throw new RuntimeException("������n��������������");
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
