package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();  //We declared a linked list with object fruits of type string
		
		fruits.add("Apple");                     // String Apple added to linkedlist fruits
		fruits.add("Orange");                    // String Orange add to linkedlist fruits
		fruits.add("Hi");                        // String Hi added to linkedlist fruits 
		
		String temp[] = new String[fruits.size()]; // declared a string array with the same size of fruits list
		
		fruits.toArray(temp);                      // here linkedlist of type string is converted to array inside temp array
		
		for(String e: temp) {                // putting string of every position in temp array to String e using for each loop
			System.out.println(e);       // printing of arrays of string from array temp
		}
	}

}
