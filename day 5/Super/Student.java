package com.Super;

public class Student extends Person{
	String name = "bhoomi";
	String Course = "BCA";
	Student()
	{
		System.out.println("calling the Student constructor");
	}
	public void display()
	{
		System.out.println("Person"  + name  +  
				"doing the Course"  +  Course);	
	}

}
