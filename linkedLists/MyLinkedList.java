package linkedLists;

public class MyLinkedList<E> {

	Node<E> head;
<<<<<<< HEAD

	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);

		if (isEmpty()) {
			head = toAdd;
			return;
		}

		Node<E> temp = head;
		while (temp.next != null) {
=======
	
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
>>>>>>> 24de017... Initial commit
			temp = temp.next;
		}
		temp.next = toAdd;
	}
<<<<<<< HEAD

	void print() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public E removeLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}

		if (temp.next == null) {
=======
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public E removeLast() throws Exception {
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}
		
		if(temp.next == null) {
>>>>>>> 24de017... Initial commit
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
<<<<<<< HEAD

		while (temp.next.next != null) {
=======
		
		while(temp.next.next != null) {
>>>>>>> 24de017... Initial commit
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
<<<<<<< HEAD

	public E getLast() throws Exception {
		Node<E> temp = head;

		if (temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		while (temp.next != null) {
=======
	
	public E getLast() throws Exception {
		Node<E> temp = head;
		
		if(temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}
		while(temp.next != null) {
>>>>>>> 24de017... Initial commit
			temp = temp.next;
		}
		return temp.data;
	}
<<<<<<< HEAD

	public static class Node<E> {
		public E data;
		public Node<E> next;

=======
	
	public static class Node<E> {
		public E data;
		public Node<E> next;
		
>>>>>>> 24de017... Initial commit
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
