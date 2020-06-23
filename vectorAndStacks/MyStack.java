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

}
