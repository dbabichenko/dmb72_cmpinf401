import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Object> test = new Stack<Object>();
		test.push(5);
		test.push(20);
		test.push("HELLO");
		
		Stack<Integer> test2 = new Stack<Integer>();
		test2.push(30);
		test2.push(50);
		
		test.push(test2);
	}
}
