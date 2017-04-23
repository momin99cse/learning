package com.practice.crud;

import java.util.*;

public class EmployeeListDemo {
	
	public static void main(String args[])
	{
		Employee e1 = new Employee("Dinesh", "Rajput","999100091");
	    Employee e2 = new Employee("Sandeep", "Sharma","998392819");
	    Employee e3 = new Employee("Vinesh", "Kohli","998131319");
	    
	    ArrayList al=new ArrayList();
	    
	    al.add(e1);
	    al.add(e1);
	    al.add(e1);
	    
	    System.out.println(al);
	    
	}

}
