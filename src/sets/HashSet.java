package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
		  System.out.println(seet.contains("Ravi"));
			 
		  seet.remove("Vijay");
		  System.out.println("\nafter removing vijay: ");
		   Iterator<String> it=seet.iterator();  
		  while(it.hasNext()){  
		   System.out.println(it.next());  
		   
		  }
		   
		   java.util.HashSet<String> lhset = new java.util.HashSet<String>();

	        // Adding elements to the LinkedHashSet
	        lhset.add("Z");
	        lhset.add("PQ");
	        lhset.add("N");
	        lhset.add("O");
	        lhset.add("KK");
	        lhset.add("FGH");
	        System.out.println(lhset);
	        
	        System.out.println("converting hashset to treeset");
	        
	        Set<String> tset = new TreeSet<String>(lhset);
	        
	        System.out.println(tset);
		  
		 }  
}
