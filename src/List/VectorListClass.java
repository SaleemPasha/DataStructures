package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorListClass {
	
	public static void main (String args[]) {
	Vector<String> vec = new Vector<String>();

/* Adding elements to a vector*/
vec.addElement("Apple");
vec.addElement("Orange");
vec.addElement("Mango");

System.out.println("Default capacity increment is: "+vec.capacity());

vec.addElement("Fig");

System.out.println("Default capacity increment is: "+vec.capacity());

/* check size and capacityIncrement*/
System.out.println("Size is: "+vec.size());
System.out.println("Default capacity increment is: "+vec.capacity());

vec.addElement("fruit1");
vec.addElement("fruit2");
vec.addElement("fruit3");

/*size and capacityIncrement after two insertions*/
System.out.println("Size after addition: "+vec.size());
System.out.println("Capacity after increment is: "+vec.capacity());

/*Display Vector elements*/
Enumeration en = vec.elements();
System.out.println("\nElements are:");
while(en.hasMoreElements())
   System.out.print(en.nextElement() + " ");

Iterator<String> p=vec.iterator();
System.out.println("\nElements are:");

while(p.hasNext())
System.out.print(p.next()+" ");

	}

}
