package com.virt.ht;

public class Tortoise extends Thread {
	public void run() {
		for(int i=1;i<=50;i++) {
		System.out.println("Tortoise :"+i);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		System.out.println("End of Tortoise");

	}
}
