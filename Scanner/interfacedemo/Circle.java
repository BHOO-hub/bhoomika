package com.interfacedemo;

public class Circle implements Shape{
	
	@Override 
	public void area() {
		double r=2.5;
		double a1=3.14*r*r;
		System.out.println("Area of circle=" + a1);
	}
	public static void main(String[] args) {
	//object
		Circle c1 = new Circle();
		c1.area();
}
}
