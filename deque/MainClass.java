package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		//method to push the element in the doubly ended queue
		ad.push(12);
		ad.push(23);
		ad.push(34);
		
		//method to print the popped element at the beginning of a doubly ended queue
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
	}

}
