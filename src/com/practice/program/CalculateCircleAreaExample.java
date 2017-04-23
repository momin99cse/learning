package com.practice.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleAreaExample {
	
	public static void main(String args[])
	{
		
		int radius=0;
		
		System.out.println("Enter radius of circle");
		
		try {		
			
			  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			  
			  radius=Integer.parseInt(br.readLine());
			
		}
		catch(NumberFormatException  ne)
		{
			System.out.println("Invalid number format : " + ne);
			System.exit(0);
		}
		catch(IOException ioe )
		{
			System.out.println("IO error : " + ioe);
			System.exit(0);
		}
		
		double area=Math.PI*radius*radius;
		
		double perimeter =2*Math.PI*radius;
		
		System.out.println("Circle area is : " + area);
		
		System.out.println("Circle perimeter is : " + perimeter);
	}

}
