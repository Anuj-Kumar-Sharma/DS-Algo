package vectorAndStacks;

import linkedLists.MyLinkedList;

public class MyStack<E> {

	private MyLinkedList<E> ll = new MyLinkedList<>();

	void push(E e) {
		ll.add(e);//adding the element in the last node of the linked list
	}

	E pop() throws Exception {
//handling the empty linked list while trying to pop
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");

		}
		return ll.removeLast();
	}

	E peek() throws Exception {
//handling the empty linked list while trying to peek
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed");

		}
		return ll.getLast();
	}
	
		void printAll() throws Exception {
	//handling the empty linked list while trying to print all the elements of the stack.
	    if(ll.isEmpty()) {
			throw new Exception("Printing an empty stack is not allowed");
        }
		ll.print();//print all the elements that are currently present in the stack.


	}
	
	boolean searchElement(E e){
		return ll.search(e);
	} 

	void deleteStack(){
		ll.deleteList();
	}
	

}
