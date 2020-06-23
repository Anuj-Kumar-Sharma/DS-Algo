package linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {

		MyLinkedList<String> myLL = new MyLinkedList();


		for (int i = 0; i < 10; i++) {
			// add method use to add a element in the last node of the linked list
      myLL.add(i + "added");

		}
// print method use to print the linked list
		myLL.print();
	}

}

