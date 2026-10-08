package StacksQueuesHashMaps.StacksandQueues;
// Queue implemented using two stacks
class QueueUsingStacks1 {

    Stack1 stack1;
    Stack1 stack2;

    QueueUsingStacks1() {
        stack1 = new Stack1();
        stack2 = new Stack1();
    }

    // Add an element to the queue
    public void enqueue(int value) {

        // Always add new elements to stack1
        stack1.push(value);

        System.out.println(
                value + " added to the queue."
        );
    }

    // Remove an element from the queue
    public int dequeue() {

        // If stack2 is empty, transfer elements
        if (stack2.isEmpty()) {

            transferElements();
        }

        if (stack2.isEmpty()) {

            System.out.println(
                    "Queue is empty."
            );

            return -1;
        }

        int value = stack2.pop();

        System.out.println(
                value + " removed from the queue."
        );

        return value;
    }

    // Transfer elements from stack1 to stack2
    private void transferElements() {

        while (!stack1.isEmpty()) {

            stack2.push(stack1.pop());
        }
    }

    // Display the front element
    public int peek() {

        if (stack2.isEmpty()) {

            transferElements();
        }

        if (stack2.isEmpty()) {

            System.out.println(
                    "Queue is empty."
            );

            return -1;
        }

        return stack2.peek();
    }

    // Check whether queue is empty
    public boolean isEmpty() {

        return stack1.isEmpty()
                && stack2.isEmpty();
    }

    // Display queue elements
    public void displayQueue() {

        if (isEmpty()) {

            System.out.println(
                    "Queue is empty."
            );

            return;
        }

        System.out.println(
                "Queue elements:"
        );

        // Display stack2 first
        stack2.display();

        // Display stack1 in reverse order
        stack1.displayReverse();
    }
}

// Stack implementation using an array
class Stack1 {

    int[] stack;
    int top;

    Stack1() {

        stack = new int[100];
        top = -1;
    }

    // Push element into stack
    public void push(int value) {

        if (top == stack.length - 1) {

            System.out.println(
                    "Stack Overflow."
            );

            return;
        }

        top++;
        stack[top] = value;
    }

    // Remove top element
    public int pop() {

        if (isEmpty()) {

            return -1;
        }

        int value = stack[top];

        top--;

        return value;
    }

    // Return top element
    public int peek() {

        if (isEmpty()) {

            return -1;
        }

        return stack[top];
    }

    // Check whether stack is empty
    public boolean isEmpty() {

        return top == -1;
    }

    // Display stack from top to bottom
    public void display() {

        for (int i = top; i >= 0; i--) {

            System.out.print(
                    stack[i] + " "
            );
        }
    }

    // Display stack from bottom to top
    public void displayReverse() {

        for (int i = 0; i <= top; i++) {

            System.out.print(
                    stack[i] + " "
            );
        }
    }
}

// Main class
public class QueueusingStacks {

    public static void main(String[] args) {

        QueueUsingStacks1 queue =
                new QueueUsingStacks1();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println();

        // Display queue
        queue.displayQueue();

        System.out.println();

        // Peek front element
        System.out.println(
                "Front element: "
                        + queue.peek()
        );

        System.out.println();

        // Dequeue elements
        queue.dequeue();
        queue.dequeue();

        System.out.println();

        // Display updated queue
        queue.displayQueue();

        System.out.println();

        // Add another element
        queue.enqueue(50);

        System.out.println();

        queue.displayQueue();
    }
}