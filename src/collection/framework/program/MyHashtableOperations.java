package collection.framework.program;

import java.util.*;

public class MyHashtableOperations {
	
	public static void main(String args[]){
		
		Hashtable <String,String> ht=new Hashtable<String, String>();
		
		ht.put("1", "first");
		ht.put("2", "second");
		ht.put("3", "third");
		
		System.out.println(ht);
		
		System.out.println(ht.get("2") );
		
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.size());
		
		ht.remove("2");
		
		System.out.println(ht);
		
		
	}

}
