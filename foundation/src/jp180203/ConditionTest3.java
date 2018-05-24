package jp180203;

public class ConditionTest3 {
	public static void main(String[] args) {
		// 分数分段统计：0-59.5不及格，60-79.5及格，80-89.5良好，90-100优秀，其他成绩均为不合理成绩
		double score = 8;
		if (score >= 0 && score <= 59.5)
			System.out.println("不及格！");
		else if (score >= 60 && score <= 79.5)
			System.out.println("及格！");
		else if (score >= 80 && score <= 89.5)
			System.out.println("良好！");
		else if (score >= 90 && score <= 100)
			System.out.println("优秀！");
		else {
			System.out.println("成绩不合理！");
		}

	}

}
