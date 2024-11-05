class ArrayStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        return (top == -1) ? -1 : stackArray[top--];
    }

    public int peek() {
        return (top == -1) ? -1 : stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class CustomStackExample {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
