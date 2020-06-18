package deque;

public class MyDeque<E> {
<<<<<<< HEAD

	Node<E> head, tail;

	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head = tail = toAdd;
		} else {
			head.next = toAdd;
			toAdd.prev = head;
			head = head.next;
		}
	}

	public E removeLast() {
		if (head == null) {
			return null;
		}
		Node<E> toRemove = tail;
		if (tail.next == null) {
=======
	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
		}
		else {
		head.next = toAdd;
		toAdd.prev = head;
		head = head.next;
		}
	} 
	
	public E removeLast() {
		if(head == null) {
			return null;
		}
		Node<E> toRemove = tail;
		if(tail.next == null) {
>>>>>>> 24de017... Initial commit
			tail = head = null;
			return toRemove.data;
		}
		tail = tail.next;
		tail.prev = null;
<<<<<<< HEAD
		if (tail == null) {
=======
		if(tail == null) {
>>>>>>> 24de017... Initial commit
			head = null;
		}
		return toRemove.data;
	}
<<<<<<< HEAD

	public static class Node<E> {
		E data;
		Node<E> next, prev;

=======
	
	public static class Node<E> {
		E data;
		Node<E> next, prev;
		
>>>>>>> 24de017... Initial commit
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}

}
