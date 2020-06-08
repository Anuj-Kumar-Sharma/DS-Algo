package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");

		String temp[] = new String[fruits.size()];
		// converting the list 'fruits' to array
		fruits.toArray(temp);

		for (String e : temp) {
			System.out.println(e);
		}
	}

}
