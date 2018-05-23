package me.socket;

import java.io.BufferedReader;

public class TestReadThread implements Runnable {
	 private BufferedReader br;

	    public TestReadThread(BufferedReader br) {
	        this.br = br;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                String line = br.readLine();
	                if (line != null)
	                    System.out.println(line);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
