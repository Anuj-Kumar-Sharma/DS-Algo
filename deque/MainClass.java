package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();

		
		//push method to push the element in the array double ended queue
		ad.push(12);
		ad.push(23);
		ad.push(34);
		
		//pop method to pop the element at the beginning of a array double ended queue

		System.out.println(ad.pop());
		System.out.println(ad.pop());

	}

}
