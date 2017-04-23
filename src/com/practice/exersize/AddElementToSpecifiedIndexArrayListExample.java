package com.practice.exersize;


import java.util.*;

public class AddElementToSpecifiedIndexArrayListExample {
	
	public static void main(String args[]){
		
		ArrayList arrayList=new ArrayList();
		
	   arrayList.add("1");
	   arrayList.add("2");
	   arrayList.add("3");
	   
	   arrayList.add(1,"new element");
	   
	   System.out.println("The arrayList contains");
	   
	   for(int i=0; i< arrayList.size(); i++){
		   System.out.println(arrayList.get(i));
	   }
	}
	

}


