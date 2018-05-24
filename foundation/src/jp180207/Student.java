package jp180207;

public class Student extends Person {
	private int sno;

	public Student() {
		super();

	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void study() {
		System.out.println(getName() + "学习！！！");
		// 错误，student继承person类，name属性需要调用全局变量this.getName()
		//或是直接调用得到全局变量的方法getName()
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("张三");
		s.setAge(18);
		s.eat();
		/*Integer.parseInt(age)*/   //强行将String类型转为int型。
		System.out.println(s);
	}

	
	

}
