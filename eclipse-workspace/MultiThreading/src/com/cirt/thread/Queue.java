package com.cirt.thread;

public class Queue {
	private int item;
	boolean valueSet = false;

	synchronized public void put(int x) {
		while (valueSet == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			item = x;
			valueSet = true;
			System.out.print("PUT :" + x);
			notify();
		}
	}

	synchronized public void get(int x) {
		while (valueSet == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			item = x;
			valueSet = true;
			System.out.print("PUT :" + item);
			notify();
		}

	}

}
