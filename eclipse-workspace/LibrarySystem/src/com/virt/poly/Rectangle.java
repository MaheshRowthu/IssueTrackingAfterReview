package com.virt.poly;

public class Rectangle extends Figure {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double area() {
		return  length*width;
	}
}
