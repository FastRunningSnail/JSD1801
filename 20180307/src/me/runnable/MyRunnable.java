package me.runnable;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<= 50;i++){
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

}
