package collection.framework.program;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSetRead {
	
	public static void main(String args[]){
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("one");
		
		hs.add("two");
		
		hs.add("three");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()){
			
			 
			
			System.out.println(  itr.next() );
		}
		
		
	}

}
