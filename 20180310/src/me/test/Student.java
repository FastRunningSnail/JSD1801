package me.test;

public class Student {
	//声明学生的三个属性
	private int id;
	private String name;
	private double score;
	
	public int getId() {
		return id;
	}

	//设置学号
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	//设置名字
	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	//设置分数
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
		return "["+"学号：" + id + ", 姓名：" + name + ", 分数：" + score + "]";
	}
}
