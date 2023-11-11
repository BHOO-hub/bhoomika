package com.java;

public interface Area {
	
	double Length = 0;
	double Width = 0;

	//Default method for circle area 
	public default  double calculatecircleArea(double radius)
	{
		return Math.PI * radius* radius;	
	}
	
	//private method for rectangle area 
	private double calculateRectangleArea(double Length,double Width)
	{
		return Length * Width ;
	}

	//private static method for triangle area
	private static double calculateTriangleArea(double base,double height)
	{
		return 0.5 * base * height;
	}
	
	//public method to calculate and display rectangle Area
	public default void displayRectangleArea( Object rectangleLength,Object rectangleWidth)
	{
		double Area = calculateRectangleArea(Length, Width);
		System.out.println("Rectangle Area:" + Area);
	}
	
	//public method to calculate and display triangle area
	public static void displayTriangleArea(double base,double height)
	{
		double area = calculateTriangleArea(base,height);
			System.out.println("Triangle Area:" + area);
	}
}
