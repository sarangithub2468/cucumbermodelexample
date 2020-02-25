package week3day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
			Map<Integer, String> empName = new HashMap<Integer, String>();
			empName.put(10001, "Hari");
			empName.put(10002, "Sam");
			empName.put(10003, "Naveen");
			empName.put(10004, "Gopi");
			empName.put(10005, "Koushik");
			empName.put(10005, "Maharaja");

			for(Entry<Integer, String> eachEntry : empName.entrySet()) {
				System.out.println(eachEntry.getKey()+" -> "
			+ eachEntry.getValue());
			}

	}
		}
	


