package com.practice.program;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateRectPerimeter {
	
	public static void main(String args[])
	{
		
		int length=0;
		int width=0;
		
		try
		{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter value of lentgth :");
		
		length=Integer.parseInt(br.readLine());
		
        System.out.println("Enter value of width :");
		
		width=Integer.parseInt(br.readLine());
		}
		//if invalid value was entered
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
		
		double perimeter=2*length+2*width;
		
		System.out.println("Perimeter : " + perimeter);
	}

}
