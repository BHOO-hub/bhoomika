package com.java9;

public interface Square {
	
	//Default method for finding Square
	public default double findSquare(double number)
	{
		return number * number;	
	}
	
	//private method for finding cube 
	private double findcube(double number)  
	{
		return number * number * number ;
	}
    
	//private static method for finding square root
	private static double findSquareRoot(double number)
	{
		return Math.sqrt(number);	
	}
	
	public default void displaycube(double number)
	{
		double cube = findcube(number);
		System.out.println("cube:" + cube);	
	}
	
	//public static method to display Square root
	public static void  displaySquareRoot (double number)
	{
		double SquareRoot = findSquareRoot(number);
		System.out.println("Square Root:" + SquareRoot);
	}
}
