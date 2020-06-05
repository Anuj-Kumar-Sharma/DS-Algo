package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(45);
		pq.add(12);
		pq.add(1);
		pq.add(100);

		System.out.println(pq);

		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());

	}

}
