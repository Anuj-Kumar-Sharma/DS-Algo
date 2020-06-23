package deque;

public class MyDeque<E> {
	
	Node<E> head, tail;
	
	public static class Node<E>{
		Node<E> next, prev;
		E data;
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void addFirst(E data) {
		Node<E> toAdd = new Node<>(data);
 		if(head == null) {
			head = tail = toAdd;
		}
 		head.next = toAdd;
 		toAdd.prev = head;
 		head = toAdd;
	}
	
	public void addLast(E data) {
		Node<E> toAdd = new Node<>(data);
		if(tail == null) {
			tail = head = toAdd;
			return;
		}
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
	}
	
	public E removeLast() {
		if(head == null) {
			return null;
		}
		if(tail.next == null) {
			Node<E> toRemove = tail;
			tail = head = null;
			return toRemove.data;
		}
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		return toRemove.data;
	}
	public E removeFirst() {
		if(head == null) {
			return null;
		}
		if(head.prev == null) {
			Node<E> toRemove = head;
			head = tail = null;
			return toRemove.data;
		}
		Node<E> toRemove = head;
		head = head.prev;
		head.next = null;
		return toRemove.data;
	}
	
	void push(E data) {
		addFirst(data);
	}
	
	E pop() {
		return removeFirst();
	}
	
	public E peekLast() {
		return tail.data;
	}
	
	public E peekFirst() {
		return head.data;
	}
}
