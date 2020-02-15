package vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack<>();
		
		int popped = stack.pop();
		
		System.out.println(popped);
		
		int peeked = stack.peek();
		
		System.out.println(peeked);
	}

}
