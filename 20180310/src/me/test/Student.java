package me.test;

public class Student {
	//����ѧ������������
	private int id;
	private String name;
	private double score;
	
	public int getId() {
		return id;
	}

	//����ѧ��
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	//��������
	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	//���÷���
	public void setScore(double score) {
		this.score = score;
	}

	public Student(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "["+"ѧ�ţ�" + id + ", ������" + name + ", ������" + score + "]";
	}
}
