package com.StringBuilder;

public class Stringinsert {
	public static  void main(String[] args)
	
	{
		StringBuilder s =new StringBuilder ("hello"); 
		 // mutable method
		s.append("world");
		System.out.println(s);
		
		StringBuilder sb =new StringBuilder("hi"); 
		//insert method
		sb.insert(0, "java");
		System.out.println(sb);
		
		StringBuilder c =new StringBuilder("welcome"); 
		//replace method
		c.replace(0, 0, "java");
		System.out.println(c);
		
		StringBuilder a =new StringBuilder ("python"); 
		//delete method
		a.delete(0, 0);
		System.out.println(a);
		a.deleteCharAt(0);
		System.out.println(a);
		
		StringBuilder b =new StringBuilder("hi"); 
		//reverse method
	    b.reverse();
	    System.out.println(b);
	    
	    
	}

}
