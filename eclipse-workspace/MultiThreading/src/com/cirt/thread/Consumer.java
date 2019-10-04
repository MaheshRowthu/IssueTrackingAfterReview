package com.cirt.thread;

import java.util.Random;

public class Consumer extends Thread{
	private Queue queue;

	public Consumer(Queue queue) {
		super();
		this.queue = queue;
	}
   
	public void run() {
		while (true) {
			queue.get(1);
			int time=new Random().nextInt(10)+3;
			try {
				Thread.sleep(time * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
