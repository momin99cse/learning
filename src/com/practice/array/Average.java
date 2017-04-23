package com.practice.array;

public class Average {
	
	
	 
	public static void main(String args[])
	{
		double nums[]={10,20.12,45,43,56,87,45};
		
		double results=0;
		
		int i;
		
		for(i=0; i<7; i++)
		{
			results=results+nums[i];
		}
		
		System.out.println("Average is : " + results/7);
	}

}
