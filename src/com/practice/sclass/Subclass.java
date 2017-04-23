package com.practice.sclass;

public class Subclass extends Superclass {
	
	
	public void printMethod(){
		
		super.printMethod();
		
		System.out.println("in subclass");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subclass sb=new Subclass();
		
		sb.printMethod();

	}

}
