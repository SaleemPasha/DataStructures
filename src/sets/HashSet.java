package sets;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		java.util.Set<String> seet=new java.util.HashSet<String>();  
		  seet.add("Ravi");  
		  System.out.println(seet.add("Vijay"));  
		  System.out.println(seet.add("Ravi"));  
		  seet.add("Ajay"); 
		  
		  
		  System.out.println("\n Traversing elements using Iterator:");
		  //Traversing elements  
		  Iterator<String> itr=seet.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  seet.remove("Vijay");
		  System.out.println("\nafter removing vijay: ");Iterator<String> it=seet.iterator();  
		  while(it.hasNext()){  
		   System.out.println(it.next());  
		  } 
		 }  
}
