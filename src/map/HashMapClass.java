package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass {
	public static void main(String args[]){  
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Sam");  
		  hm.put(101,"Psh");  
		  hm.put(102,"Kric");  
		  for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }
}
