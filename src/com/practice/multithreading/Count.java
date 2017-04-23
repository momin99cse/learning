package com.practice.multithreading;

public class Count extends Thread {
	
	Count()
	{
		super("My extending thread");
		
		System.out.println("My thread created" + this);
		
		start();
	}
	
	
	public void run()
	{
		
		try
		{
			
			for(int i=0; i<10 ; i++)
			{
			System.out.println("Printing the count" + i);
			Thread.sleep(1000);
			}
			
			
		}
		catch(Exception  e)
		{
			 System.out.println("my thread interrupted");	
		}
		
		System.out.println("My thread run is over" );
	}

}
