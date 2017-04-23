package collection.framework.program;

import java.util.ArrayList;
import java.util.*;

public class MyCollectionIterator {
	
	public static void main(String args[]){
		
		List<Integer> myList=new ArrayList<Integer>();
		
		myList.add(4);
		myList.add(6);
		myList.add(2);
		myList.add(7);
		
		Iterator<Integer> itr=myList.iterator();
		
		while(itr.hasNext()) {
			
			Integer listData=itr.next();
			
			System.out.println("Item is : " + listData);
		}
		
		
		
		
		
	}

}
