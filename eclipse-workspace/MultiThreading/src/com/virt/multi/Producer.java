package com.virt.multi;

import java.util.Random;

public class Producer extends Thread{
	private Queue queue;
	
	public Producer(Queue queue) {
		super();
		this.queue = queue;
	}
	public void run() {
		int value=1;
		while(true) {
			int time= new Random().nextInt(10);
			try {
				Thread.sleep(time * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			queue.put(value++);
		}
	}
}
