package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<String> names = new ArrayList<String>();
		names.add("Balaji");
		names.add("Arun");
		names.add("Sam");
		names.add(1,"Gopi");
		names.add("Arun");
		names.remove("Arun");
		for (String eachName : names) {
			System.out.println(eachName);
		}
		if(names.contains("Sam")) {
		System.out.println("True");
		}else {
			System.out.println("False");
		}
        System.out.println("0000000000000");
		System.out.println(names.get(1));
		int size = names.size();
		System.out.println("SIZE: "+size);
		System.out.println(names.get(size-1));

		//to clear the entire list
//		names.clear();
		//to validate the list is empty
//		boolean empty = names.isEmpty();
		Collections.sort(names);
		Collections.reverse(names);
		System.out.println("*****************************");
		for (String eachName : names) {
			System.out.println(eachName);
		}
	}
}

