package com.virt.ht;

public class HareTortoiseMain {

	public static void main(String[] args) {
		Hare t1 = new Hare();
		Tortoise t2 = new Tortoise();
		t1.start();
		t2.start();
		 {
		if (t1.isAlive() && !t2.isAlive()) {
			System.out.println(" is the Winner");
		}
		else
			System.out.println("Tortoise is the Winner");

	}

}
}