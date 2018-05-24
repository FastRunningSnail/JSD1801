package jp180206;

public class Test {
	
	public int f(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*f(n-1);
		}
	}
	public int sum(int n){
		if(n==1){
			return f(1);
		}return sum(n-1)+f(n);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		/*System.out.println(t.f(1)+t.f(2)+t.f(3)+t.f(4)+t.f(5));*/
		System.out.println(t.sum(5));
	}

}
