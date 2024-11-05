import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);

        // Peeking the top element
        System.out.println("Peek: " + stack.peek());

        // Popping an element from the stack
        stack.pop();
        System.out.println("Stack after popping an element: " + stack);

        // Searching for an element
        int position = stack.search(10);
        System.out.println("Position of 10: " + (position >= 0 ? position : "Not found"));
    }
}
