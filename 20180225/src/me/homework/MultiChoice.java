package me.homework;

import java.util.Arrays;

public class MultiChoice extends Question {
	char[] answers;

	public MultiChoice() {

	}

	public MultiChoice(String text, String[] options, char[] answers) {
		super(text, options);
		this.answers = answers;
	}

	public char[] getAnswers() {
		return answers;
	}

	public void setAnswers(char[] answers) {
		this.answers = answers;
	}

	/*
	 * public boolean check(char []answers){ return
	 * Arrays.equals(this.answers,answers); }
	 */
	public boolean check(char[] answers) {
		// ��ʽһ��
		if (this.answers.length != answers.length)
			return false;
		for (int index = 0; index < answers.length; index++) {
			if (this.answers[index] != answers[index])
				return false;
		}

		/*
		 * // ��ʽ���� String this_answers = new String(this.answers); String
		 * input_answers = new String(answers);
		 * if(!this_answers.equals(input_answers)) return false;
		 */

		return true;
	}

}
