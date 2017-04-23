package com.practice.generics;

public class GenericMethodTest {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E element : inputArray)
			System.out.printf("%s",element);
	}
	
	public static void main(String args[])
	{
		Integer[] intArray ={1,2,3,4,5}; 
		Double[] doubleArray ={1.1,2.2,3.3,4.4}; 
		Character[] charArray ={'H','E','L','L','O'};
		
		System.out.println("Integer array");
		
		printArray(intArray);
		
		System.out.println("Double array");
		
		printArray(doubleArray);
		
		System.out.println("Character array");
		
		printArray(charArray);
		
	}

}
