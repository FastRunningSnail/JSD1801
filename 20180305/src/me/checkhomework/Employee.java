package me.checkhomework;

public class Employee {
	public String name; // ����
	public String sex; // �Ա�
	public double workAge; // ����
	public double salary; // нˮ
	public double award; // ����

	public Employee() {
	}

	public Employee(String name, String sex, double workAge, double salary, double award) {
		super();
		this.name = name;
		this.sex = sex;
		this.workAge = workAge;
		this.salary = salary;
		this.award = award;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getWorkAge() {
		return workAge;
	}

	public void setWorkAge(double workAge) {
		this.workAge = workAge;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAward() {
		return award;
	}

	public void setAward(double award) {
		this.award = award;
	}
}
