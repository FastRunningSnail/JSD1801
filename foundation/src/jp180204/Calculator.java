package jp180204;

public class Calculator {
	//����һ�����������������ļӷ��������ؽ��
	public void add(double num1, double num2){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	public void minus(double num1, double num2){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	
	//����һ������ ������������ĳ˷��������ؽ��
	public void multi(double num1,double num2,double num3) {
		System.out.println(num1+"*"+num2 +"*"+num3 +"=" + num1*num2*num3);
		
	}
	//����һ������ �� ���������ĳ˷��������ؽ��
	public double div(double num1 , double num2){
		return num1/num2;
	}
	
	/*public double div(double num1 , double num2){
		return num1/num2;
		if num2 == 0
		}*/
	//����һ�������� ��������������࣬�����ؽ��
	public int mod(int num1, int num2){
		//System.out.println(num1+"%"+num2+"="+(num1%num2));
		return num1%num2;
		
	}
		
	
	//����һ�������������������������� �����ؽ��
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
