package javacollections61;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		  
        // Elements are added using add() method
		set.add("A");
		set.add("B");
		set.add("C");
  
        // Duplicates will not get insert
		set.add("C");
  
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(set);

	}

}
