package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();
<<<<<<< HEAD

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");

		String temp[] = new String[fruits.size()];

		fruits.toArray(temp);

		for (String e : temp) {
=======
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e: temp) {
>>>>>>> 24de017... Initial commit
			System.out.println(e);
		}
	}

}
