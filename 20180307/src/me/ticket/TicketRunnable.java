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
	 * �ܹ�100�������ڸ���80 ����1����ɹ���ʣ�ࣺ20 ����2����ɹ���ʣ�ࣺ-60 ��Ʊ��-60��, ����80������3����ʧ�ܣ�
	 */
	// ���1��
	// ����1�߳�ִ�л�û��ticket+=numberʱ��
	// ����2�߳̽�����ִ�����ж�ticket-number������0�������ɹ�
	// ���2��
	// ����123ͬʱ����80�ţ�����ִ��ticket-=number֮ǰ�������߳���ͬʱִ��-=
	// ��󶼹���ɹ�������ʾʣ��20
	/**
	 * ����2����ɹ���ʣ�ࣺ20 ����3����ɹ���ʣ�ࣺ-140 ����1����ɹ���ʣ�ࣺ-60
	 */

	/**
	 * ����2����ɹ���ʣ�ࣺ20 ����3����ɹ���ʣ�ࣺ20 ����1����ɹ���ʣ�ࣺ20
	 */
	/**
	 * ����1����ɹ���ʣ�ࣺ20 ��Ʊ��20��, ����80������2����ʧ�ܣ� ��Ʊ��20��, ����80������3����ʧ�ܣ�
	 */
	@Override
	public void run() {
		if (ticket - number >= 0) {
			System.out.println(Thread.currentThread().getName() + "����ɹ���ʣ�ࣺ" + (ticket -= number));
		} else {
			System.out.println("��Ʊ��" + ticket + "��, ����" + number + "��" + Thread.currentThread().getName() + "����ʧ�ܣ�");
		}
	}

}
