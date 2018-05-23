package me.exercise;

public class ShapeTest {
	public static void main(String[] args) {
		// 圆心
		Point c1 = new Point(1, 2);
		// 圆形
		Circle c = new Circle(c1, "蓝色", 5);
		System.out.println("圆形面积：" + c.calcArea());

		// 中心点
		Point c2 = new Point(3, 4);
		// 矩形
		Rectangle r = new Rectangle(c2, "绿色", 2.5, 2);
		System.out.println("矩形面积：" + r.calcArea());
	}
}
