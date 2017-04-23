package collection.framework.program;

import java.util.*;

public class MyItrRemoveElement {
	
	public static void main(String args[]){
		
		String remElement="Perl";
		
		List<String> myList=new ArrayList<String>();
		
		myList.add("C++");
		myList.add("Java");
		myList.add("C");
		myList.add("Perl");
		
		System.out.println(myList);
		
		Iterator itr=myList.iterator();
		
		while(itr.hasNext()){
             
			if(remElement.equals(itr.next())){
                itr.remove();
            }
        }
		
		System.out.println("After deletion");
		System.out.println(myList);
	}

}
