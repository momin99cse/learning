package com.practice.misc;

public class Client {
	
	public static void main(String args[]) throws Exception
	{
		int price=120;
		
		if(price<0)
		{
			throw new MyOwnExceptionClass(price);
			
		}
		else if(price==0) 
		{
			throw new MyZeroExecption(price);
		}
		else
		{
			System.out.println("Price is : " + price);
		}
	}
	

}
