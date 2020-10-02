package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {
	
	public static void main(String[] args) {
	
//		Map<String, Integer> numbers = new HashMap<>(); //This is how you create an object of HashMap
//	
//		numbers.put("one", 1); // put function helps let you add <E1,E2> pairs in the HashMap
//		numbers.put("two", 2);
//		numbers.put("five", 5);
//		
//		numbers.remove("two", 4); // This is how you remove pair from HashMap
//		
//		System.out.println(numbers);		//Printing contents on HashMap
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet());
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet(); 
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		
//		System.out.println(numbers);
		
		System.out.println(getHash("GOD"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}
}
