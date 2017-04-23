package com.practice.program;

public class BinaryConverter {
	
	public static void main(String args[])
	{
		for(int i=1; i<10 ; i++)
		{
			//System.out.println(i +" : " + toBinary(i));
			 
			System.out.println(i + " : " + Integer.toBinaryString(i));
		}
	}
	
	public static String toBinary(int base10Number)
	{
		boolean isNeg=base10Number<10;
		
		base10Number=Math.abs(base10Number);
		
		String result="";
		
		while (base10Number>0)
		{
			result =(base10Number%2) + result;
			
			base10Number=base10Number/2;
			
			
		}
		 
		  
	     return result;

		

	}

}
