package com.practice.program;

public class JavaInterfaceExample implements IntExample {

	@Override
	public void sayHello() {
		System.out.println("Hello world");

	}
	
	public static void main(String args[])
	{
		JavaInterfaceExample ji=new JavaInterfaceExample();
		ji.sayHello();
	}

}
