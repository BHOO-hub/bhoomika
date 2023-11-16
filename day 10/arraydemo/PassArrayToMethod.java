package com.arraydemo;

public class PassArrayToMethod {
	public static void add(int[] a)
	{
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("Sum of Elements=" + sum);
	}
	 
	public static void main(String[] args)
	{
		int arr[] = {10,30,46,8};
		add(arr);
	}

}

