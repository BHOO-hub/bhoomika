package com.staticc;

public class Additionprogram {
	
	//static block
	static {
		      System.out.println("initializing Additionprogram..");
	}
	
	//constructor
	public Additionprogram()
	{
		System.out.println("constructor");
	}
	
	//static method for Addition 
	public static int add(int num1,int num2)
	{
		return num1 + num2;
		
	}
	
	public static void main(String[] args)
	{
		int number1 = 5;
		int number2 = 15;
		int sum = add(number1 , number2);
		Additionprogram a1 = new Additionprogram();
		System.out.println("Sum:" + sum);
	}
}
