package com.cirt.thread;

public class PrinterThread extends Thread{
	private String msg;
	private Printer printer;
	public PrinterThread(String msg, Printer printer) {
		super();
		this.msg = msg;
		this.printer = printer;
	}
	
	public void run() {
		synchronized(printer) 
		{
			printer.print(msg);
		}
	}
}
