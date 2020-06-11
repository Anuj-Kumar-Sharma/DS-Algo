package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		//We declared a linked list with object fruits of type string

		List<String> fruits = new LinkedList();	
		
		//String "Apple", "Orange" and "Hi" added to linkedlist fruits
		
		fruits.add("Apple");		
		fruits.add("Orange");		
		fruits.add("Hi");		
		
		//declared a string array with the same size of fruits list
		
		String temp[] = new String[fruits.size()];	
		
		//here linkedlist of type string is converted to array inside temp array
		
		fruits.toArray(temp);		
		
		// putting string of every position in temp array to String e using for each loop
		
		for(String e: temp) {	 
			
			// printing of arrays of string of array temp through use of string e
			
			System.out.println(e);	

		
	}

}
