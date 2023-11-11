package com.java;

public class Main implements Area{
	
	public static void main(String[] args)
	{
		double circleRadius = 9.0;
		double rectanagleLength = 3.0;
		double rectanagleWidth = 2.0;
		double triangleBase = 3.0;
		double triangleHeight  = 3.0;
		
		//Using default method for circle area
		double circleArea = new Main().calculatecircleArea(circleRadius);
		System.out.println("circle Area:" + circleArea);
		
		//Using public  method to display rectangle area
		new Main().displayRectangleArea(rectanagleLength, rectanagleWidth);
		
		//Using static method to display triangle area
		Area.displayTriangleArea(triangleBase,triangleHeight);
	}
}
