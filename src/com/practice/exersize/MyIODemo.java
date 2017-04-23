package com.practice.exersize;

import java.io.*;

public class MyIODemo {
	
	public static void main(String args[])throws IOException {
		
		 FileInputStream in=null;
		 FileOutputStream out=null;
		 
		 try 
		 {
			 
			 in = new FileInputStream("//home//user//Documents//InputFile.txt");
			 out = new FileOutputStream("//home//user//Documents//OutputFile.txt");
			 
			 int c;
			 
			 while((c=in.read())!=-1){
				 
				 out.write(c);
			 }
	    }
			 finally
			 {
				 if(in!=null)
				 {
					 in.close();

				 }
				 if(out != null)
				 {
					 out.close();
				 }
			 }

		 }
		 
		 
		 
		
	}


