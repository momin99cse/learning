package example.chapter14;

import java.util.*;

 class TestGenerics2 {
	 
	 public static void main(String args[])
	 {
		 Map<Integer, String> map=new HashMap<Integer, String>();
		 
		 map.put(1, "momin");
		 
		 map.put(4, "mithila");
		 
		 map.put(2, "mumit");
		 
		//Now use Map.Entry for Set and Iterator  
		 
		 
		 Set<Map.Entry<Integer, String>> set=map.entrySet();
		 
		  
		 Iterator<Map.Entry<Integer, String>> itr=set.iterator();
		 
		 while(itr.hasNext() )
		 {
			 Map.Entry e=itr.next();
			 
			 System.out.println(e.getKey() + " " + e.getValue() );
			 
		 }
		 
	 }

}
