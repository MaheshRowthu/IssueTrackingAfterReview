package com.ut.test;

public class StringMover {
	public String moveLastTwo(String str) {
		String initialPart = str.substring(0, str.length() - 2);
		String lastTwo = str.substring(str.length() - 2, str.length());
		String res=lastTwo+initialPart;
		System.out.println(res);
		return res;
	}
		public static void main(String[] args) {
			String str="mahesh";
			StringMover obj = new StringMover();
			obj.moveLastTwo(str);
		
	}
}
