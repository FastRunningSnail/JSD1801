package me.exercise;

public class Circle extends Shape{
	private static final double PI = 3.14;//��������PI��ֵ
	private double r;//�뾶

	public Circle() {
		super();
		
	}

	public Circle(Point p, String color,double r) {
		super(p, color);
		this.r=r;
		
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	/*@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}*/
	
	/**
	 * ����Բ�����
	 */
	public double calcArea(){
//		return Math.PI*r*r;
		return PI*r*r;
	}

}
