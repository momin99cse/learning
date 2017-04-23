package com.practice.multithreading;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Runnable interface");

	}
	
	public static void main(String args[])
	{
		Thread  t=new Thread(new RunnableThread() );
		t.start();
	}

}
