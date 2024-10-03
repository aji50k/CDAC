import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty() && stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        // Test Case 1
        MinStack minStack1 = new MinStack();
        minStack1.push(5);
        minStack1.push(3);
        minStack1.push(7);
        System.out.println("Min = " + minStack1.getMin()); // Output: 3

        // Test Case 2
        MinStack minStack2 = new MinStack();
        minStack2.push(10);
        minStack2.push(8);
        minStack2.push(6);
        minStack2.push(12);
        System.out.println("Min = " + minStack2.getMin()); // Output: 6
    }
}
