package com.virt.str;

public class StringDemo {

	public static void main(String[] args) {
		String str = "This   is         good option";
		String str1 = str.replaceAll("\\s+"," ");
		System.out.println(str1);
		/*
		for (int j = 0; j < arr.length; j++) {
			String arrChar=arr[j];
			System.out.print(arrChar+" ");
		}
		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str);
			if (str.charAt(i) == ' ') {

			} else
				System.out.print(str.charAt(i));
		}*/
	}

}
//false
//true
//false
//false
//false
//true