package MinMaxStackDS;

import java.util.Stack;

public class MinMaxStack extends Stack<Integer> {

	/**
	 * Created By Anilabha Baral
	 */
	private static final long serialVersionUID = 1L;
	private Stack<Integer> minStack;
	private Stack<Integer> maxStack;

	public MinMaxStack() {
		minStack = new Stack<Integer>();
		maxStack = new Stack<Integer>();
	}

	public void push(int value) {
		if (value <= min()) { // Note the '=' sign here
			minStack.push(value);
		}

		if (value >= max()) {
			maxStack.push(value);
		}

		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();

		if (value == min()) {
			minStack.pop();
		}

		if (value == max()) {
			maxStack.pop();
		}

		return value;
	}

	public int min() {
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return minStack.peek();
		}
	}

	public int max() {
		if (maxStack.isEmpty()) {
			return Integer.MIN_VALUE;
		} else {
			return maxStack.peek();
		}
	}

	public static void main(String[] args) {
		MinMaxStack ms = new MinMaxStack();
		ms.push(18);
		ms.push(5);
		ms.push(14);
		ms.push(55);
		ms.push(16);
		ms.push(51);
		ms.push(11);
		ms.push(53);
		
		//here in my custom MinMaxStack Class can 
//		  1) Get Minimum
//
//        2) Get Maximum
//
//        3) Insert Minimum
//
//        4) Insert Maximum
//
//        5) Delete Minimum
//
//        6) Delete Maximum  
//           
//         Element  in the stack in O(1) Time 

		System.out.println("MAX Value In the Stack = "+ms.max());
		System.out.println("MIN Value In the Stack = "+ms.min());
		
	}
}