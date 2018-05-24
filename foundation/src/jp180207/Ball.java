package jp180207;

public class Ball {
	private String size;
	private String color;
	public Ball() {
		super();
		
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Ball [size=" + size + ", color=" + color + ", getSize()=" + getSize() + ", getColor()=" + getColor()
				+ "]";
	}
	
	

}
