package me.exercise2;

public abstract class Shape {
	private Point p;
	

	public Shape() {
	}

	public Shape(Point p) {
		super();
		this.p = p;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	public abstract double area();
	

}
