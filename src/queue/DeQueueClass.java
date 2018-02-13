package queue;

import java.util.Deque;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DeQueueClass {

	public static void main(String[] args)
    {
        Deque deque = new LinkedList<String>();
 
        // We can add elements to the queue in various ways
        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)"); //add to head
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");
 
        System.out.println(deque + "\n");
 
        // Iterate through the queue elements.
        System.out.println("Standard Iterator");
        Iterator iterator = (Iterator) deque.iterator();
        while (((java.util.Iterator) iterator).hasNext())
            System.out.println("\t" + iterator.next());
 
 
        // Reverse order iterator
        Iterator reverse = (Iterator) deque.descendingIterator();
        System.out.println("Reverse Iterator");
        while (((java.util.Iterator) reverse).hasNext())
            System.out.println( reverse.next());
 
        // Peek returns the head, without deleting
        // it from the deque
        System.out.println("Peek " + deque.peek());
        System.out.println("After peek: " + deque);
 
        // Pop returns the head, and removes it from
        // the deque
        System.out.println("Pop " + deque.pop());
        System.out.println("After pop: " + deque);
 
        // We can check if a specific element exists
        // in the deque
        System.out.println("Contains element 3: " +
                        deque.contains("Element 3 (Tail)"));
 
        // We can remove the first / last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing " +
                            "first and last: " + deque);
 
    }
	
}
