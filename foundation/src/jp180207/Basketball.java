package jp180207;

public class Basketball extends Ball {
	private String shape;

	public Basketball() {
		super();
		
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public void function(){
		System.out.println("���������ĵ�");
	}

	@Override
	public String toString() {
		return "Basketball [shape=" + shape + ", getSize()=" + getSize() + ", getColor()=" + getColor() + "]";
	}
	
	public static void main(String[] args) {
		Basketball bask = new Basketball();
		bask.setSize("�����С");
		bask.setColor("purple");
		bask.setShape("Բ��");
		bask.function();
		System.out.println(bask);
		
		
	}

}
