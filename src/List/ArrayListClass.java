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
		
		System.out.println(numbers);
		
		
		System.out.println("\n");
		
		Iterator<Integer> p=numbers.iterator();
		
		while(p.hasNext())
		System.out.println(p.next());
		
		
	}
}
