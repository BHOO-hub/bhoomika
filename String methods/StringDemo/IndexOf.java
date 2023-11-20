package com.StringDemo;

public class IndexOf {
	//main method
	public static void main(String[] args)
	{
		String str = "Welcome to javacpoint";
		int count = 0;
		int startFrom = 0;
		for(;;)
		{
			int index = str.indexOf('a',startFrom);
			if(index >= 0)
			{
				//match found. hence , increment the count
				count = count + 1;
				
				//start looking after the searched index
				startFrom = index + 1;
			}
			else
			{
				//the value of index is -1 here. therefore, terminate the loop
				break;
				
			}
		}
		
		     System.out.println("in the string:" + str);
		     System.out.println("The 'a' character has come" + count + "times");
	}

}
