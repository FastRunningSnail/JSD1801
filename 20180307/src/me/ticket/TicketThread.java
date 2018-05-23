package me.ticket;

/**
 * 门票类
 * 
 * @author Administrator
 *
 */

public class TicketThread extends Thread {
	private Ticket ticket;
	private int number;

	public TicketThread() {

	}

	public TicketThread(String name, Ticket ticket, int number) {
		super(name);// super中的变量直接super调用
		this.ticket = ticket;
		this.number = number;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (ticket.getCount() - number >= 0) {
			ticket.setCount(ticket.getCount() - number);
			System.out.println(Thread.currentThread().getName() + "购买成功，剩余：" + ticket.getCount());
		} else {
			System.out.println("余票：" + ticket.getCount() + "张, 不足"+number+"," + Thread.currentThread().getName() + "购买失败！");
		}
	}

}
