package com.practice.program;

public class SwapElementsExample {
	
	public static void main(String args[])
	{
		int num1=10;
		int num2=20;
		
		System.out.println("Number before swapping");
		System.out.println("First number is : " + num1);
		System.out.println("Second number is :"+ num2);
		
		swap(num1,num2);
	}
	
	private  static void swap(int n1, int n2)
	{
		int t=0;
		t=n1;
		n1=n2;
		n2=t;
		
		System.out.println("After swaping");
		System.out.println("First number is :" + n1);
		System.out.println("Second number is :" + n2);
	}

}
