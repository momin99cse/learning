package com.practice.program;

public class FindEvenOrOddNumberEasyWay {
	
	public static void main(String args[])
	{
		
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		
		for(int x : nums)
		{
			    if(x%2 == 0)
				System.out.println(x + " is even number.");
				else
				System.out.println(x + " is odd number.");
		}
		
	}
}
