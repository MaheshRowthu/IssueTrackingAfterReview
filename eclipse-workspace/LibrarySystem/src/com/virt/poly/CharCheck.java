package com.virt.poly;

public class CharCheck {

	public static void main(String[] args) {
		char arr[]= {'a','b','c','a','z','b','c','e','f','f','@','@'};
		// TODO Auto-generated method stub
		
		int lengths=arr.length;
		char dup[]= {};
		dup=arr;
	//	System.out.println(dup);
		//System.out.println(lengths);
		
		for(int i=0;i<lengths;i++) {
			for(int j=i;j<lengths;j++) {
			if(arr[j]==dup[i] && i!=j ) {
			System.out.println(arr[i]);	
			}
			}
		}
	}

}
