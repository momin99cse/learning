package collection.framework.program;

import java.util.*;

public class MyBasicHashMap {
	
	public static void main(String args[]){
		
		HashMap<String, String> hm=new HashMap<String,String>();
		
		 hm.put("first", "FIRST INSERTED");
	     hm.put("second", "SECOND INSERTED");
	     hm.put("third","THIRD INSERTED");
	     
	     System.out.println(hm);
	     
	     System.out.println("Value of second :" + hm.get("second"));
	     
	     System.out.println("Is Hashmap is empty :" + hm.isEmpty());
	     
	     hm.remove("third");
	     
	     System.out.println(hm);
	     
	     System.out.println("Size of HashMap : " + hm.size());
		
	}

}
