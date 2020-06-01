package vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack<>();
		
		int popped = stack.pop();// delete the top element of the stack.
		
		System.out.println(popped);//print the last popped element of the stack.
		
		System.out.println(stack.peek());//print the top element of the stack.
	}

}
