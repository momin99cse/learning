package com.practice.program;

public class Factorial {
	
	public static void main(String args[])
	{
		final int NUM_FACTS=10;
		
		for(int i=1; i<NUM_FACTS; i++)
		{
		System.out.println(i + "! is : " + factorial(i));	
		}
	}
	
	public static int factorial(int n)
	{
		int result=1;
		
		for(int i=1; i<=n; i++)
		{
			result=result*i;
		}
		
		return result;
		
	}

}
