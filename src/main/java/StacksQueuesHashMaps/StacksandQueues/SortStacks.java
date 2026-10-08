/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
Author: Prakhar Khare
Date: 6-10-2026
 */

package StacksQueuesHashMaps.StacksandQueues;
// Stack implementation
class SortStack1 {

    int[] stack;
    int top;

    SortStack1() {
        stack = new int[100];
        top = -1;
    }

    // Push an element into the stack
    public void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow.");
            return;
        }

        top++;
        stack[top] = value;
    }

    // Remove the top element
    public int pop() {

        if (isEmpty()) {
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    // Return the top element
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

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}

// Main class
public class SortStacks {

    // Sort the stack using recursion
    public static void sortStack(SortStack1 stack) {

        // Base condition
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int value = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Insert the removed element
        // at its correct position
        insertInSortedOrder(stack, value);
    }

    // Insert an element into its correct position
    private static void insertInSortedOrder(
            SortStack1 stack, int value) {

        // If stack is empty or value is greater than
        // or equal to the top element, push it
        if (stack.isEmpty() || value >= stack.peek()) {

            stack.push(value);
            return;
        }

        // Remove the top element temporarily
        int topElement = stack.pop();

        // Recursively find the correct position
        insertInSortedOrder(stack, value);

        // Put the removed element back
        stack.push(topElement);
    }

    public static void main(String[] args) {

        SortStack1 stack = new SortStack1();

        // Add elements to the stack
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack:");
        stack.display();

        // Sort stack
        sortStack(stack);

        System.out.println("Sorted Stack:");
        stack.display();
    }
}