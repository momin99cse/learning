package com.practice.multithreading;

public class SingleThread extends Thread {
	
	public void run()
	{
		System.out.println("Single thread example");
	}
	
	public static void main(String args[])
	{
		SingleThread t=new SingleThread();
		
		t.start();
	}

}
