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
		System.out.println(getName() + "ѧϰ������");
		// ����student�̳�person�࣬name������Ҫ����ȫ�ֱ���this.getName()
		//����ֱ�ӵ��õõ�ȫ�ֱ����ķ���getName()
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����");
		s.setAge(18);
		s.eat();
		/*Integer.parseInt(age)*/   //ǿ�н�String����תΪint�͡�
		System.out.println(s);
	}

	
	

}
