package com.virt.poly;

public class PolyMain {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Figure ar[] = new Figure[5];
		ar[0] = new Figure();
		ar[1] = new Rectangle(12, 14);
		ar[2] = new Rectangle(7, 13);
		ar[3] = new Circle(8);
		ar[4] = new Circle(8);
		
		double res = 0;
		for (int i = 0; i < ar.length; i++) {
			res = res + ar[i].area();
		}
		System.out.println("Sum of array of Areas: " + Math.round(res));
		
		
		Figure f = new Figure();
		System.out.println(f.area());
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(10, 30);
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(8);
		f = r1;
		System.out.println(f.area());
		double s = sumArea(c1, c2);

	}

	private static double sumArea(Figure f1, Figure f2) {

		return f1.area() + f2.area();
	}
}
