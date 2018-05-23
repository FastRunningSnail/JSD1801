package me.exercise;

public class Summer extends Season {

	@Override
	public void calcFee(int i) {
		System.out.println("您的电费是："+PRICE*i);
	}

}
