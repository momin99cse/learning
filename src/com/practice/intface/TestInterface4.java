package com.practice.intface;

public class TestInterface4 implements Showable {

	@Override
	public void print() {

     System.out.println("print");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("show");

	}
	
	public static void main(String args[])
	{
		TestInterface4 obj=new TestInterface4();
		
		obj.show();
		obj.print();
		
	}

}
