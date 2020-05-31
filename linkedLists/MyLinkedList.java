package linkedLists;

public class MyLinkedList<E> {

	Node<E> head; //Head node.

	/** 
	 * Function to add a new into MyLinkedList.
	 */
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		//If MyLinkedList id empty then it adds the Node at the head position.
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		//If MyLinkedList is not empty then it traverses to the last node and adds new node after it.
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	/**
	 * Function to display MyLinkedList, from head to tail.
	 */
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	/**
	 *  Function to check whether MyLinkedList is empty or not.
	 * @return true if MyLinkedList is empty.
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/**
	 *  Function to remove the last node of MyLinkedList.
	 * @return the value of type E.
	 * @throws Exception
	 * 			User defined exception if no such node exist, i.e. MyLinkedList is already empty.
	 */
	public E removeLast() throws Exception {
		Node<E> temp = head;
		
		
		// Throws Exception if MyLinkedList is already empty.
		if(temp == null) {
			throw new Exception("Cannot remove last element from empty linked list");
		}
		
		// Removes the last node.
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		//Traverses to second last node.
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	/**
	 * Function to peek last node from MyLinkedList.
	 * @return the value of type E.
	 * @throws Exception
	 * 			User defined exception if no such node exist, i.e. MyLinkedList is already empty.
	 */
	public E getLast() throws Exception {
		Node<E> temp = head;
			
		// Throws Exception if MyLinkedList is already empty.
		if(temp == null) {
			throw new Exception("Cannot peek last element from empty linked list");
		}

		//Traverses to last node.
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	/**
	 * Static class to initilise Node as soon as a object of class MyLinkedList is created.
	 * @param <E> Type of data stored in every node.
	 */
	public static class Node<E> {
		public E data;
		public Node<E> next;
		
		//Constructor
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
