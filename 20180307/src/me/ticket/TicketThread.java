package me.ticket;

/**
 * ��Ʊ��
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
		super(name);// super�еı���ֱ��super����
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
			System.out.println(Thread.currentThread().getName() + "����ɹ���ʣ�ࣺ" + ticket.getCount());
		} else {
			System.out.println("��Ʊ��" + ticket.getCount() + "��, ����"+number+"," + Thread.currentThread().getName() + "����ʧ�ܣ�");
		}
	}

}
