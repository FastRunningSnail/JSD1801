package jp180207;

/**
 * Teacher类继承Person类
 * 
 * @author Administrator
 *
 */
public class Teacher extends Person {
	private int wno;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWno() {
		return wno;
	}

	public void setWno(int wno) {
		this.wno = wno;
	}
	
	public void teach(){
		System.out.println(this.getName()+"上课！！！！");
		
	}

	@Override
	public String toString() {
		return "Teacher [wno=" + wno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("张老师");
		t.setAge(30);
		t.teach();
		System.out.println(t);
}

}
