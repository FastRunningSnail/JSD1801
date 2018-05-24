package jp180205;

public class FN2 {
	
	/**
	 * ¼ÆËã1*2*3*....*n µÄ½×³Ë
	 * 
	 * @param n
	 * @return
	 */
	public int f(int n){
		if (n==1){
			return 1;
		}
		return f(n-1)*n;
	}
	
	public int f1(int n){
		if (n==1){
			return 1;
		}
		return f1(n-1)+n;
	}
	
	public static void main(String[] args) {
		FN2 fn2 = new FN2();
		System.out.println(fn2.f(5));
		System.out.println(fn2.f1(5));
	}

}
