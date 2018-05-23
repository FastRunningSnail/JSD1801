package me.checkhomework;

public class Student implements Comparable<Student>{
	private String name;
	private int sno;
	public Student() {
	}
	public Student(String name, int sno) {
		super();
		this.name = name;
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
//	public int CompareTo(Student obj)
//    {
//        Student stu = (Student)obj;
//        if (this.sno > stu.sno)
//            return 1;
//        else if (this.sno == stu.sno)
//            return 0;
//        else
//            return -1;
//    }
	@Override
	public int compareTo(Student o) {
		return sno-o.getSno();
	}
	
}
