package me.ticket;

/**
 * ������ʱ�������߳���ͬʱ���У�����1����40������2Ҳ������󴰿�3ֻ����20����
 * ����ʱ�������߳�ͬʱ���У�����1����2����Ʊ��100ʱͬʱ���ɹ���40��������ʣ��60������3����
 * 
 * @author Administrator
 *
 */
public class TicketTest3 {
	public static void main(String[] args) {
		TicketRunnable runnable = new TicketRunnable(100,80);
		
		Thread tt1 = new Thread(runnable,"����1");
		Thread tt2 = new Thread(runnable,"����2");
		Thread tt3 = new Thread(runnable,"����3");
		
		tt1.start();
		tt2.start();
		tt3.start();
		
	}

}
