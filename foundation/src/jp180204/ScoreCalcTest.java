package jp180204;

public class ScoreCalcTest {
	public static void main(String[] args) {
		/*ScoreCalc sc = new ScoreCalc();
		sc.setJava(80);
		sc.setC(90);
		sc.setDb(100);*/
		
		ScoreCalc sc = new ScoreCalc(80,90,100);
		
		//sc.avg();
		sc.showAvg();
		//sc.sum();
		sc.showSum();
		
		
	}
	
}
