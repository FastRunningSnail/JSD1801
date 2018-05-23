package me.ticket;

public class TicketRunnable implements Runnable {
	private int ticket;
	private int number;

	public TicketRunnable() {
	}

	public TicketRunnable(int ticket, int number) {
		super();
		this.ticket = ticket;
		this.number = number;
	}

	/**
	 * 总共100，三窗口各买80 窗口1购买成功，剩余：20 窗口2购买成功，剩余：-60 余票：-60张, 不足80，窗口3购买失败！
	 */
	// 情况1：
	// 窗口1线程执行还没到ticket+=number时，
	// 窗口2线程进来先执行了判断ticket-number，大于0输出购买成功
	// 情况2：
	// 窗口123同时抢到80张，都在执行ticket-=number之前，三个线程再同时执行-=
	// 最后都购买成功，都显示剩余20
	/**
	 * 窗口2购买成功，剩余：20 窗口3购买成功，剩余：-140 窗口1购买成功，剩余：-60
	 */

	/**
	 * 窗口2购买成功，剩余：20 窗口3购买成功，剩余：20 窗口1购买成功，剩余：20
	 */
	/**
	 * 窗口1购买成功，剩余：20 余票：20张, 不足80，窗口2购买失败！ 余票：20张, 不足80，窗口3购买失败！
	 */
	@Override
	public void run() {
		if (ticket - number >= 0) {
			System.out.println(Thread.currentThread().getName() + "购买成功，剩余：" + (ticket -= number));
		} else {
			System.out.println("余票：" + ticket + "张, 不足" + number + "，" + Thread.currentThread().getName() + "购买失败！");
		}
	}

}
