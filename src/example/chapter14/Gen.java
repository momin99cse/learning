package example.chapter14;

 class Gen<T> {
	 
	 T ob;
	 
	 Gen(T o)
	 {
		 ob=o;
	 }
	 
	 T getob()
	 {
		 return ob;
	 }
	 
	 void showType()
	 {
		 System.out.println(" The type of T is " + ob.getClass().getName());
	 }

}
