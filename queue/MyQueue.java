package queue;

import linkedLists.MyLinkedList.Node;

public class MyQueue<E> {
<<<<<<< HEAD

	private Node<E> head, rear;

	public void enqueue(E e) {

		Node<E> toAdd = new Node<>(e);
		if (head == null) {
			head = rear = toAdd;
			return;
		}

		rear.next = toAdd;
		rear = rear.next;

	}

	public E dequeue() {

		if (head == null) {
			return null;
		}

		Node<E> temp = head;
		head = head.next;

		if (head == null) {
			rear = null;
		}

		return temp.data;
	}

=======
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
	
		rear.next = toAdd;
		rear = rear.next;
		
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		
		Node<E> temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		
		return temp.data;
	}
	
>>>>>>> 24de017... Initial commit
}
