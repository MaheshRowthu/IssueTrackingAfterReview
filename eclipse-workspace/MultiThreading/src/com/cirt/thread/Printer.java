package com.cirt.thread;

public class Printer extends Thread{
	public void print(String msg) {
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(msg);
		System.out.print("]");
		System.out.println();
	}
}
