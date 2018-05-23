package me.homework;

public class Question {
	private String text;
	String[] options;

	public Question() {
	}


	public Question(String text, String[] options) {
		super();
		this.text = text;
		this.options = options;
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public boolean check(char[] answers) {
		return false;
	}

	public void print(){
		System.out.println(this.text);
		for(int i=0;i<options.length;i++){
		System.out.println(options[i]+" ");
		}
	}
}
