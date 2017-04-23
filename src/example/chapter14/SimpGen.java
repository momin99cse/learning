package example.chapter14;

 class SimpGen {
	 
	 public static void main(String args[])
	 {
		 TwoGen<Integer, String> tgObj= new TwoGen<Integer, String>(88,"Two gen string");
		 
		 tgObj.showTypes();
		 
		 int v=tgObj.getob1();
		 
		 System.out.println("Value of v" + v);
		 
		 String str=tgObj.getob2();
		 
		 System.out.println("value str  "  + str );
		 
	 }

}
