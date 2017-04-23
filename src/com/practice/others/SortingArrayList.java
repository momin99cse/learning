package com.practice.others;

import java.util.ArrayList;
import java.util.Collections;
 

class SortingArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("22");
		al.add("11");
		al.add("33");
		al.add("aa");
		al.add("bb");
		al.add("cc");
		
		System.out.println("Printing list before processing");
		
		for(String val : al)
			System.out.println(val);
		
		Collections.sort(al);
		
		System.out.println("Printing list after processiog");
		
		for(String val : al)
			System.out.println(val);
		
	}

}
