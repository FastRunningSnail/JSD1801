package me.exercise;
/**
 * 平面图形
 * @author Administrator
 *
 */

public class Shape {
	Point p;// 中心点
	String color;
	
	public Shape() {
		super();
	}
	public Shape(Point p, String color) {
		super();
		this.p = p;
		this.color = color;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
/*	@Override
	public String toString() {
		return "Shape [p=" + p + ", color=" + color + "]";
	}*/
	
	public double calcArea(){
		return 0.0;
		
	}

}
