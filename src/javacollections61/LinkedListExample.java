package javacollections61;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// Creating object of the
        // class linked list
        LinkedList<String> list
            = new LinkedList<String>();
  
        // Adding elements to the linked list
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
  
        System.out.println(list);
  
        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
  
        System.out.println(list);

	}

}
