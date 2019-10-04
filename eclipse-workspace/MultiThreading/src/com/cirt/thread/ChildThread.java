package com.cirt.thread;

public class ChildThread extends Thread{
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println("Child :"+i);
		}
	}

}
