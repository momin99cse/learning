package collection.framework.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListandLinkedList {
	
	public static void main(String args[]){
		
		List<String> llist=new ArrayList<String>();
		
		llist.add("one");
		llist.add("two");
		llist.add("three");
		llist.add("four");
		llist.add("five");
		llist.add(2,"second");
		
		System.out.println(llist);
		
		List<String> lkList=new LinkedList<>();
		
		lkList.add("one");
		lkList.add("two");
		lkList.add("three");
		
		System.out.println(lkList);
		
		lkList.addAll(llist);
		
		System.out.println(lkList);
		
		String element1=llist.get(0);
		
		System.out.println(element1);
		
		String element2=lkList.get(2);
		
		System.out.println(element2);
		
		for(String element : llist) {
			
			System.out.println("element is : " +element);
		}
		
		Iterator<String> itr=llist.iterator();
		
		while(itr.hasNext()){
			
			System.out.println("itr element : " +itr.next());
		}
		
		
		if (llist.contains("two")){
			System.out.println("Item found");
		}
		else{
			System.out.println("Item not found");
		}
			
		
		System.out.println("Before sort : " + llist);
		
		Collections.sort(llist);
		
		System.out.println("After sort : " + llist);
		
	
		
		
		
		
		
	}

}
