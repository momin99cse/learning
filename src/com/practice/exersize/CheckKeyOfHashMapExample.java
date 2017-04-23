package com.practice.exersize;

import java.util.HashMap;

public class CheckKeyOfHashMapExample {
	
	public static void main(String args[]){
		
		HashMap hMap=new HashMap();
		
		hMap.put("1","One");
	    hMap.put("2","Two");
	    hMap.put("3","Three");
	    
	    boolean blnExists=hMap.containsKey("3");
	    
	    System.out.println("exists status : " + blnExists);
	}

}
