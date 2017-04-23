package com.practice.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaFactorialUsingRecursion {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		System.out.println("Enter number");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int number=Integer.parseInt(br.readLine());
		
		int result=fact(number);
		
		System.out.println("Factorial is : " + result);
		
		
		
	}
	
	static int fact(int b)
	{
		if (b<=1)
		{
			return 1;
		}
		else
		{
			return b*fact(b-1);
		}
	}

}
