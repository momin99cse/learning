package example.chapter14;

 class BoundsDemo {
	 
	 public static void main(String args[])
	 {
		 Integer inums[]={1,3,2,4,5,6};
		 
		 Stats<Integer> iOb=new Stats<Integer>(inums);
		 
		 double v=iOb.average();
		 
		 System.out.println("Value of V " + v);
		 
	 }

}
