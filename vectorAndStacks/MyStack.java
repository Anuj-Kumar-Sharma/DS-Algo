package vectorAndStacks;

import linkedLists.MyLinkedList;

public class MyStack<E> {
<<<<<<< HEAD

	private MyLinkedList<E> ll = new MyLinkedList<>();

	void push(E e) {
		ll.add(e);
	}

	E pop() throws Exception {
		if (ll.isEmpty()) {
=======
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
>>>>>>> 24de017... Initial commit
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
<<<<<<< HEAD

	E peek() throws Exception {
		if (ll.isEmpty()) {
=======
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
>>>>>>> 24de017... Initial commit
			throw new Exception("Peeking from empty stack is not allowed");
		}
		return ll.getLast();
	}
<<<<<<< HEAD
=======
	
>>>>>>> 24de017... Initial commit

}
