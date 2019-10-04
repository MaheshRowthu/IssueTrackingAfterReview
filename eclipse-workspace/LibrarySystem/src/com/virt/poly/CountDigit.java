package com.virt.poly;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,30,53},count0=0,count1=0,count2=0;
		Integer dup;
		String dupStr="";
		
		for(int i=0;i<arr.length-1;i++) {
//			System.out.println();
			dup=arr[i];	
			//for(int j=0;j<2;j++) {
					dupStr=dup.toString();
					if(dupStr.charAt(i)=='0') {
						count0++;
					}
					if(dupStr.charAt(i)=='1') {
						count1++;
					}
					else count2++;
		}//}
		System.out.println("0 count :"+count0);
		System.out.println("1 count :"+count1);
		System.out.println("2 count :"+count2);
	}

}
