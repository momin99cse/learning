package com.practice.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String 	str();
  int val();
}

public class Meta {
	
	@MyAnno(str="annotation example", val=2000)
	public static void MyMeth()
	{
		Meta ob=new Meta();
		
		try
		{
			Class<?> c=ob.getClass();
			
			Method m=c.getMethod("MyMeth");
			
			MyAnno anno=m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() +"  " + anno.val());
			
			
			
			
			
		}
		catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
			}
	}
	
	public static void main(String args[])
	{
		MyMeth();
	}

}
