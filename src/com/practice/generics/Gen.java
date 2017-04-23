package com.practice.generics;

class Gen<T> {
	
	T ob;
	
	Gen(T o){
		ob=o;
	}
	
	T getOb()
	{
		return ob;
	}
	
     void ShowType(){
    	 System.out.println(ob.getClass().getName() );
     }
}
