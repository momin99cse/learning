package collection.framework.program;

import java.util.*;

public class MyHashMapRead {
	
	public static void main(String args[]) {
		
		HashMap<String, String> hm=new HashMap<String, String>();
		
		 hm.put("first", "FIRST INSERTED");
	     hm.put("second", "SECOND INSERTED");
	     hm.put("third","THIRD INSERTED");
	     
	     System.out.println(hm);
	     
	     Set<String> keys=hm.keySet();
	     
	     for(String key :  keys){
	    	 
	    	 System.out.println("Value of " + key + "  is " + hm.get(key));
	     }
		
		
	}

}
