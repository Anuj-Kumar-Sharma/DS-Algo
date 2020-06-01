package vectorAndStacks;

import linkedLists.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		ll.add(e);//add the element in the last node of the linked list
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");//handling the empty linked list while trying to pop
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed");//handling the empty linked list while trying to peek
		}
		return ll.getLast();
	}
	

}
