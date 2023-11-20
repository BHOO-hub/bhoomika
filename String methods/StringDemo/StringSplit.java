package com.StringDemo;

public class StringSplit {
	public static void main(String[] args) 
	{
		String s1 = "c++ String split method by c++point";
		String [] words = s1.split("\\s"); //splits the string based on whitespace
		//using c++ foreach loop to print elements of string array
		for(String w:words)
		{
			System.out.println(w);
		}
	}

}
