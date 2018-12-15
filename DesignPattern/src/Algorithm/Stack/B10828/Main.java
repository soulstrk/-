package Algorithm.Stack.B10828;

public class Main {
	
	
	public static void main(String[] args) {
		Stack stack = Stack.getInstance();
		
		stack.push(3);
		stack.push(5);
		stack.push(2);
		stack.pop();
		stack.push(11);
		stack.top();
		
		System.out.println(stack);
	}
}
