package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		/*adding elements to queue*/
		ad.push(12);
		ad.push(23);
		ad.push(34);
		/*taking elements out of queue*/
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
	}

}
