package example.java.framework;

import java.util.*;

public class LinkedListExample {
	
	public static void main(String args[])
	{
		List<Book> list=new LinkedList<Book>();
		
		Book b1=new Book(100,"momin",34);
		Book b2=new Book(101,"mithila",26);
		Book b3=new Book(102,"mumit",03);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list)
		{
			System.out.println(b.id + "  " + b.name + " " + b.quantity  );
		}
	}

}
