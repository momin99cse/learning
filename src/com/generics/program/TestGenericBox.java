package com.generics.program;

public class TestGenericBox {
	
	public static void main(String args[]){
		
		GenericBox<String> box1=new GenericBox<String>("Hello");
		String str=box1.getContent();
		
		System.out.println(box1); 
		
		
	}
	
	

}
