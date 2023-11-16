package com.Array;

public class Main {
	public static void main(String[] args)
	{
		Employee[] details;
		details  = new Employee[3];
		details[0]  = new Employee(100, "abc" , "A");
		details[1]  = new Employee(101, "par" , "C");
		details[2]  = new Employee(102, "bcd" , "k");
	    for(Employee i:details)
	    {
	    	System.out.println(i.id + "" + i.name + "" + i.loc);
	    }
	}

}
