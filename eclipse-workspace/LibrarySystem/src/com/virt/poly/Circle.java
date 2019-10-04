package com.virt.poly;

public class Circle extends Figure {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
}
