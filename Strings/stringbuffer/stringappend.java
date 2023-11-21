package com.stringbuffer;

public class stringappend {
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer ("hello");
		//mutable  method
		s.append("world");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer ("hi");
		//insert method
		sb.insert(0, "java");
		System.out.println(sb);
		
		StringBuffer b = new StringBuffer ("how are you");
		//replace method
		b.replace(0, 0, "ok");
		System.out.println(b);
		
		StringBuffer sb1 = new StringBuffer ("how are you doing");
		//delete method
		sb1.delete(0, 0);
		System.out.println(sb1);
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		StringBuffer c = new StringBuffer("java");
		//reverse method
	    c.reverse();
	    System.out.println(c);
	    
	    
	}

}
