package week3day2;

import java.util.HashMap;
import java.util.Map;

public class MappracticeDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//take a string amazon
		// convert it into character array using toCharArray
		// Declare a Map<Character,Integer>--->TreeMap
		// Iterate over the character array
		// Check for the availability of each char in the map
		// if available increase the count(value) by 1 else add the char as key and
		// count(value) as 1.

		String a = "amazon";
		char[] b = a.toCharArray();
		System.out.println(b);
		Map<Character, Integer> name = new HashMap<Character, Integer>();
		System.out.println(name);
		for (char name1 : b) {

			if (name.containsKey(name1)) {
				// name.put(name1, name.get(name1)+1);
				Integer count = name.get(name1);
				name.put(name1, count + 1);
			} else {
				// name.put(name1, 1);
				name.put(name1, 1);

			}

		}
		System.out.println(name);

	}

}
