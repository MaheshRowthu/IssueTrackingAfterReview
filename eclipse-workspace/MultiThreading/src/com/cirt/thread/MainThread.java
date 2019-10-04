package com.cirt.thread;

public class MainThread {

	public static void main(String[] args) {
		ChildThread obj = new ChildThread();
		obj.start();
		for (int i = 1; i <= 50; i++) {
			System.out.println("Main :" + i);
		}
	}

}
