package me.homework;

public class SingleChoice extends Question{
	char answer; //单选标准答案

	public SingleChoice() {

	}

	public SingleChoice(String text, String[] options, char answer) {
		super(text,options);
		this.answer = answer;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public boolean check(char[] answers) {
		if (answers == null && answers.length != 1) {
			return false;
		} else {
			return answer == answers[0];
		}
	}

}
