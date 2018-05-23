package me.ticket;

/**
 * 不出错时，三个线程在同时进行，窗口1买了40，窗口2也够买，最后窗口3只抢到20不够
 * 出错时，三个线程同时进行，窗口1窗口2在总票数100时同时都成功买40，总量都剩余60，窗口3进入
 * 
 * @author Administrator
 *
 */
public class TicketTest3 {
	public static void main(String[] args) {
		TicketRunnable runnable = new TicketRunnable(100,80);
		
		Thread tt1 = new Thread(runnable,"窗口1");
		Thread tt2 = new Thread(runnable,"窗口2");
		Thread tt3 = new Thread(runnable,"窗口3");
		
		tt1.start();
		tt2.start();
		tt3.start();
		
	}

}
