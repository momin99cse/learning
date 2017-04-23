package com.practice.exersize;

import java.util.ArrayList;

public class ArrayVsArrayList {
	
	
	public static void main(String args[]){
		
		int[] myArray=new int[6];
		
		for (int i=0;i<6;i++){
			myArray[i]=i+2;
		}
		
		for(int i=0;i<myArray.length;i++){
			
			System.out.println("Value of array "+ i + " is " + myArray[i]);
		}
		
		ArrayList<Integer> myArrayList=new ArrayList<Integer>();
		
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);
		
		for(int i=0; i< myArrayList.size(); i++){
			System.out.println("Element is : " + myArrayList.get(i));
		}
		
		
		
	}

}
