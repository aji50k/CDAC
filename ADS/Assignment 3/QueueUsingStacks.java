import java.util.Stack;

class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public void displayQueue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue = [");
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i));
                if (i > 0) System.out.print(", ");
            }
            for (int i = 0; i < stack1.size(); i++) {
                if (!stack2.isEmpty() || i > 0) System.out.print(", ");
                System.out.print(stack1.get(i));
            }
            System.out.println("]");
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class QueueUsingStacks {

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        // Test Case 1
        System.out.println("Test Case 1:");
        queue.enqueue(3);
        queue.enqueue(7);
        queue.displayQueue();
        int dequeuedElement1 = queue.dequeue();
        queue.displayQueue();
        System.out.println("Dequeued element = " + dequeuedElement1);
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.displayQueue();
        int dequeuedElement2 = queue.dequeue();
        int dequeuedElement3 = queue.dequeue();
        queue.displayQueue();
        System.out.println("Dequeued elements = " + dequeuedElement2 + ", " + dequeuedElement3);
    }
}
