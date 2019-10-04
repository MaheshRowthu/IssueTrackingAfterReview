package com.cirt.thread;

public class PrinterSynchronized extends Thread{

	public static void main(String[] args) {
		Printer printer=new Printer();
		PrinterThread t1=new PrinterThread("java", printer);
		PrinterThread t2=new PrinterThread("thread", printer);
		t1.start();
		t2.start();
	}

}
