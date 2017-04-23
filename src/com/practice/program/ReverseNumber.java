package com.practice.program;

public class ReverseNumber {
	
	public static void main(String args[])
	{
		int number=12435;
		int rnumber=0;
		int temp=0;
		
		while (number>0)
		{
			temp=number%10;
			
			rnumber=rnumber*10+temp;
			
			number=number/10;
		}
		
		System.out.println("Revrse is : " + rnumber);
	}

}
