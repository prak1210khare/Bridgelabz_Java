/*8. Doubly Linked List: Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.
Author: Prakhar Khare
Date: 5-10-2026
 */
package LinkedList.DoubleLinkedList;
// Node representing one text state
class TextStateNode1 {

    String text;

    TextStateNode1 prev;
    TextStateNode1 next;

    TextStateNode1(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

// Doubly linked list for undo/redo history
class TextEditorHistory1 {

    TextStateNode1 head;
    TextStateNode1 tail;
    TextStateNode1 current;

    // Maximum number of states allowed
    final int MAX_HISTORY = 10;

    int historySize = 0;

    // Add a new text state
    public void addState(String text) {

        TextStateNode1 newNode =
                new TextStateNode1(text);

        // If there is no state yet
        if (head == null) {

            head = newNode;
            tail = newNode;
            current = newNode;

            historySize++;

            return;
        }

        /*
         * If we are not at the latest state,
         * remove all redo states.
         */
        if (current.next != null) {

            TextStateNode1 node = current.next;

            while (node != null) {

                historySize--;

                node = node.next;
            }

            current.next = null;
            tail = current;
        }

        // Add the new state after current
        newNode.prev = current;
        current.next = newNode;

        current = newNode;
        tail = newNode;

        historySize++;

        // Limit history to 10 states
        if (historySize > MAX_HISTORY) {

            removeOldestState();
        }
    }

    // Remove the oldest state
    private void removeOldestState() {

        if (head == null) {
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        historySize--;

        // If only one node remains
        if (head == null) {
            tail = null;
            current = null;
        }
    }

    // Undo the last action
    public void undo() {

        if (current == null) {
            System.out.println("No text state available.");
            return;
        }

        if (current.prev == null) {

            System.out.println("Nothing to undo.");

            return;
        }

        current = current.prev;

        System.out.println("Undo performed.");
    }

    // Redo the undone action
    public void redo() {

        if (current == null) {
            System.out.println("No text state available.");
            return;
        }

        if (current.next == null) {

            System.out.println("Nothing to redo.");

            return;
        }

        current = current.next;

        System.out.println("Redo performed.");
    }

    // Display current text
    public void displayCurrentState() {

        if (current == null) {

            System.out.println("Text is empty.");

            return;
        }

        System.out.println(
                "Current Text: " + current.text
        );
    }

    // Display complete history
    public void displayHistory() {

        if (head == null) {

            System.out.println("History is empty.");

            return;
        }

        TextStateNode1 node = head;

        System.out.println("\n===== Text History =====");

        while (node != null) {

            if (node == current) {

                System.out.println(
                        "-> " + node.text + " [CURRENT]"
                );

            } else {

                System.out.println(
                        "   " + node.text
                );
            }

            node = node.next;
        }

        System.out.println();
    }
}

// Main class
public class TextEditorUndoRedo {

    public static void main(String[] args) {

        TextEditorHistory1 editor =
                new TextEditorHistory1();

        // Add text states
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! Welcome");
        editor.addState("Hello World! Welcome to");
        editor.addState("Hello World! Welcome to Java");

        // Display current text
        editor.displayCurrentState();

        // Undo
        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        // Redo
        editor.redo();
        editor.displayCurrentState();

        // Display history
        editor.displayHistory();

        // Add a new state after undo
        editor.addState(
                "Hello World! Welcome to Programming"
        );

        editor.displayCurrentState();

        // Display updated history
        editor.displayHistory();
    }
}
