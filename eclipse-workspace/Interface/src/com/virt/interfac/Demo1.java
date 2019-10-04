package com.virt.interfac;

public class Demo1 implements Figure {

	public double area(double x) throws Exception {
		double res=x*x;
		return res;
	}
	public static void main(String[] args)   {
			Figure f;
			f=new Demo1();
			try {
				f.area(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
}