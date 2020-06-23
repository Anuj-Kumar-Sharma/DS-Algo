package vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack = new MyStack<>();

    // delete the top element of the stack.
		int popped = stack.pop();

    //print the last popped element of the stack.
		System.out.println(popped);

    //print the top element of the stack.
		int peeked = stack.peek();

		System.out.println(peeked);

	}

}
