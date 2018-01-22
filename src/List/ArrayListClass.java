package List;
import java.util.*;

public class ArrayListClass {

	
	public static void main (String[] pasha)
	{
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(8);
		
		

		numbers.add(5);
		numbers.add(6);
		numbers.add(25);
		numbers.add(01);
		//one way to print arraylist
		System.out.println(numbers);
		
		
		System.out.println("\n");
		
		numbers.remove(4);
		//printing using Iterator
		Iterator<Integer> p=numbers.iterator();
		
		while(p.hasNext())
		System.out.println(p.next());
		
		System.out.println("\n");

		//another way of printing
		for(Integer x:numbers)
			System.out.println(x);
		
		numbers.clear();
		System.out.println("\n");
		System.out.println(numbers.size()+" is the size of the arraylist");
		
	}
}
