package com.practice.program;

public class FindLargestSmallestNumber {
	
	public static void main(String args[])
	{
		int[] numbers=new int[]{19,13,34,67,12,9,43,58};
		
		int smallest=numbers[0];
		int greatest=numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if (numbers[i]>greatest)
			{
				greatest=numbers[i];
			}
			if (numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		
		System.out.println("The smallest number is " + smallest);
		System.out.println("The greatest number is " + greatest);
	}

}
