package com.virt.multi;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		Queue queue= new Queue();
		Producer p= new Producer(queue);
		Consumer c = new Consumer(queue);
		p.start();
		c.start();
		
	}

}
