package collection.framework.program;

import java.util.HashMap;
import java.util.Set;

public class MyDuplicateKeyEx {
	
	public static void main(String args[]){ 
	
		HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Adding duplicate key...");
        hm.put(key, "Grape");
        System.out.println("After adding dulicate key:");
        printMap(hm);
	
	}
	
	public static void printMap(HashMap<Price, String> map){
        
        Set<Price> keys = map.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
	

}
