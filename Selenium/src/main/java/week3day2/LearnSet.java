package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> names = new TreeSet<String>();
		names.add("Balaji");
		names.add("arun");
		boolean add = names.add("Sam");
		System.out.println(add);
		names.add("Gopi");
		boolean add2 = names.add("Sam");
		System.out.println(add2);
		int size = names.size();
		System.out.println("Size: "+size);
		for (String eachName : names) {
			System.out.println(eachName);
		}
		
		

	}

}
