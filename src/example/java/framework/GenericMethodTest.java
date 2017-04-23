package example.java.framework;

public class GenericMethodTest {
	
	public static <E> void printArray (E[] inputArray)
	{
		for( E element : inputArray)
		{
			System.out.printf(" %s  ", element);
		}
		
		System.out.println();
	}
	
	public static void main(String args[])
	{
		
		Integer[] intArray={1,2,3,4,5};
		
		printArray(intArray);
		
		Character[] charArray={'A','B','C','D','E'};
		
		printArray(charArray);
		
	}

}
