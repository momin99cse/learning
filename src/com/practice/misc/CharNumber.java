package com.practice.misc;

public class CharNumber {
	
	public static void main(String args[])
	{
		String str="1Desco1Soft";
		
		for( int i=0 ; i<str.length(); i++)
		{
			Boolean flag=Character.isDigit(str.charAt(i));
			
			if (flag)
			{
				System.out.println("'"+ str.charAt(i)+"'" + " is a number");
			}
			else
			{
				System.out.println("'"+ str.charAt(i)+"'" + " is a character");
			}
			
			Boolean flag2=str.substring(0,1).matches("[0-9]");
			
			if (flag2)
			{
				System.out.println("First caharater is a number");
			}
			else
			{
				System.out.println("First caharater is a character");	
			}
			
		}
	}

}
