package me.exercise;

public class ShapeTest {
	public static void main(String[] args) {
		// Բ��
		Point c1 = new Point(1, 2);
		// Բ��
		Circle c = new Circle(c1, "��ɫ", 5);
		System.out.println("Բ�������" + c.calcArea());

		// ���ĵ�
		Point c2 = new Point(3, 4);
		// ����
		Rectangle r = new Rectangle(c2, "��ɫ", 2.5, 2);
		System.out.println("���������" + r.calcArea());
	}
}
