package com.practice.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateRectArea {
	
	public static void main(String args[])
	{
		int width=0;
		int length=0;
		
		try
		{
			BufferedReader  br=new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Enter length of rectangle");
			
			length=Integer.parseInt(br.readLine());
			
            System.out.println("Enter length of rectangle");
			
			width=Integer.parseInt(br.readLine());		
			
			 
		}
		catch(NumberFormatException ne)
        {
                System.out.println("Invalid value" + ne);
                System.exit(0);
        }
        catch(IOException ioe)
        {
                System.out.println("IO Error :" + ioe);
                System.exit(0);
        }
		
		double area=length*width;
		
		System.out.println("Area of rectangle is area : " + area);
		
	}

}
