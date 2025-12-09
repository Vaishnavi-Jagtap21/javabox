package lists;
import java.util.Stack;


public class stack1 {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<>();
		
//		Pushing elements
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
//		peeking at the top element
		System.out.println(stack.peek());
		
//		popping elements
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
//		checking if the stack is empty
		System.out.println(stack.isEmpty());
		
	}

}
