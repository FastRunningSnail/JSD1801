package jp180204;

public class ScoreCalc{
/*	private double java;
	private double c;
	private double db;
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getDb() {
		return db;
	}
	public void setDb(double db) {
		this.db = db;
	}*/
	/*
	@Override
	public String toString() {
		return "ScoreCalc [java=" + java + ", c=" + c + ", db=" + db + "]";
	}
	*/
	private double java;
	private double c;
	private double db;
	
	public ScoreCalc(double java, double c, double db){
		this.java = java;
		this.c= c;
		this.db=db;
	}
	
	/**
	 * 计算平均成绩
	 */
	
	public double avg(){
		return (java +c +db)/3;
	}
	
	public void showAvg(){
		System.out.println("您的平均成绩是"+avg());
	}
	/**
	 * 计算总成绩
	 */
	public double sum(){
		return java+c+db;
	}	
	public void showSum(){
		System.out.println("您的总成绩是"+sum());
	
	}
	
}
 

