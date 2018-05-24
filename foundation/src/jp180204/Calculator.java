package jp180204;

public class Calculator {
	//定义一个方法，完成两个书的加法，并返回结果
	public void add(double num1, double num2){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	public void minus(double num1, double num2){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	
	//定义一个方法 ，完成三个数的乘法，并返回结果
	public void multi(double num1,double num2,double num3) {
		System.out.println(num1+"*"+num2 +"*"+num3 +"=" + num1*num2*num3);
		
	}
	//定义一个方法 ， 完成两个书的乘法，并返回结果
	public double div(double num1 , double num2){
		return num1/num2;
	}
	
	/*public double div(double num1 , double num2){
		return num1/num2;
		if num2 == 0
		}*/
	//定义一个方法， 完成两个数的求余，并返回结果
	public int mod(int num1, int num2){
		//System.out.println(num1+"%"+num2+"="+(num1%num2));
		return num1%num2;
		
	}
		
	
	//定义一个方法，完成两个书的五则运算 并返回结果
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 4);
		calc.minus(2,3);
		calc.multi(1,2,3);
		
		double result = calc.div(1, 2);
		System.out.println(result);
		int result2 = calc.mod(2, 4);
		System.out.println(result2);
		}
	
}
