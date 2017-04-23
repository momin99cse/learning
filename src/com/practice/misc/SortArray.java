package com.practice.misc;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String args[]) {
		
		String[] countries={"Bangladesh","Africa","Turkey","America","Soudi Arabia"};
		
		Arrays.sort(countries);
		
		for(int i=0; i<countries.length; i++ ) {
			
			System.out.println("Country is : " + countries[i]);
		}
	}

}
