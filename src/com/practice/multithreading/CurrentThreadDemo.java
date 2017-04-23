package com.practice.multithreading;

class CurrentThreadDemo {
	
	public static void main(String args[])
	{
		Thread t= Thread.currentThread();
		
		System.out.println("Name of current state : " + t);
		
		t.setName("My Thread");
		
		System.out.println("Thread Name after change : " + t);
		
		try
		{
			for(int n=5; n>0; n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		
	}

}
