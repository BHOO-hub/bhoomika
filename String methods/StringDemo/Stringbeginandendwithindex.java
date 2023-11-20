package com.StringDemo;

class Stringbeginandendwithindex
{

		private char[] Value;

		public String substring(int beginIndex,int endIndex)
	{
		if (beginIndex < 0)
		{
			throw new StringIndexOutOfBoundsException(beginIndex);
		}
		
		if (endIndex > Value.length)
		{
			throw new StringIndexOutOfBoundsException(endIndex);
		}
		
		int sublen =  endIndex - beginIndex ;
		if (sublen < 0)
		{
			throw new StringIndexOutOfBoundsException(sublen);
		}
		return null;
	
	}
}

 