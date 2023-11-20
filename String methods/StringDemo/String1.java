package com.StringDemo;

public class String1 {
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = new
	    String("hi");
		String s3 = s1 . concat(s2);
		System.out.println(s3);
		String s4 = "python";
		char ch;
		for(int i=0; i<s4.length();i++);
		{
			ch= s4.charAt(0);
			System.out.println("python at first index is " + ch);
			ch= s4.charAt(3);
			System.out.println("python at last index is " + ch);
		}
		
		    System.out.println("Length of a string PYTHON is" + s4.length());
		    System.out.println(s4.substring(0));
		    System.out.println(s4.substring(0 , 3));
		    System.out.println(s3.contains("Hello"));
	}

}

