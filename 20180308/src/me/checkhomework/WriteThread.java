package me.checkhomework;

import java.io.BufferedWriter;
import java.util.LinkedList;

public class WriteThread implements Runnable {
	private BufferedWriter bw;
	private LinkedList<String> message;

	public WriteThread(BufferedWriter bw, LinkedList<String> message) {
		super();
		this.bw = bw;
		this.message = message;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (message.size() == 0) {
					System.out.println("������û�����ݣ���������...");
					Thread.sleep(5000);
				} else {
					String header = message.poll();// ��ö��е�һ��Ԫ��
					if ("quit".equals(header)) {
						break;// �������߳̽�����ǣ�д�߳�Ҳ��֮����
					}
					System.out.println("����д�����ͷԪ��...");
					bw.write(header);
					bw.flush();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { if (bw != null)
                bw.close();

			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				System.out.println("д�߳̽���");
			}
		}
	}

}
