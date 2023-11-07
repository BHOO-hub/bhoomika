package com.singleLevel.inheritance;

public class Triangle extends shape 
{
	double breadth;
	double height;
	double area;
	
 public void calculateArea() {
		area=0.5*(breadth*height);
		System.out.println("The area of the triangle is: " +area);
	}
}

