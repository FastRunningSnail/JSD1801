package jp180205;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		double r;
		System.out.print("����Բ�İ뾶��");
		Scanner s = new Scanner(System.in);
		r = s.nextDouble();
		double area = Math.PI * r * r;
		System.out.print("���Ϊ��" + area);
	}

}
