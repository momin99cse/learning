package com.practice.program;

public class SwapElementsWithoutThirdVariableExample {
	
	public static void main(String args[])
	{
		int num1=10;
		int num2=20;
		
		System.out.println("Before swaping");
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After sapping");
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		
	}

}
