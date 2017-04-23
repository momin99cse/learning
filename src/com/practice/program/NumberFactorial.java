package com.practice.program;

public class NumberFactorial {
	
	public static void main(String args[])
	{
		int factorial=5;
		
		int number=1;
		
		for(int i=2; i<=factorial; i++)
		{
			number=number*i;
		}
		
		System.out.println("The factorial is : " + number);
	}

}
