package javacollections61;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		// Inserting the Elements
		map.put(3, "Geeks");
		map.put(2, "For");
		map.put(1, "Geeks");

		System.out.println(map);

	}

}
