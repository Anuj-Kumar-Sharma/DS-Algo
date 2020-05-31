package linkedLists;

/**
 * Driver class to run MyLinkedList functions.
 */
public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		
		for(int i = 0; i<10; i++) {
			myLL.add(i+"added");
		}
	
		myLL.print();
	}

}
	