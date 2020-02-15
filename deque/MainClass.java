package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.push(12);
		ad.push(23);
		ad.push(34);
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
	}

}
