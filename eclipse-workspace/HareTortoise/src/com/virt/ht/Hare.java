package com.virt.ht;

public class Hare extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Hare :"+i);
			if(i==30) {
				try {
					Thread.sleep(12000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(50);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of Hare");
	}
}
