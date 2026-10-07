/*Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
        Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.
Author: Prakhar Khare
Date: 5-10-2026
 */
package LinkedList.CircularLinkedList;
// Node class
class TaskNode1 {

    int taskId;
    String taskName;
    int priority;
    String dueDate;

    TaskNode1 next;

    // Constructor
    TaskNode1(int taskId, String taskName,
              int priority, String dueDate) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}


// Circular Linked List class
class TaskCircularList1 {

    TaskNode1 head;
    TaskNode1 current;

    // 1. Add task at beginning
    public void addAtBeginning(int taskId,
                               String taskName,
                               int priority,
                               String dueDate) {

        TaskNode1 newNode =
                new TaskNode1(
                        taskId,
                        taskName,
                        priority,
                        dueDate
                );

        // If list is empty
        if (head == null) {

            head = newNode;
            newNode.next = head;
            current = head;

        } else {

            TaskNode1 last = head;

            // Find the last node
            while (last.next != head) {
                last = last.next;
            }

            newNode.next = head;
            last.next = newNode;
            head = newNode;
        }

        System.out.println("Task added at the beginning.");
    }


    // 2. Add task at end
    public void addAtEnd(int taskId,
                         String taskName,
                         int priority,
                         String dueDate) {

        TaskNode1 newNode =
                new TaskNode1(
                        taskId,
                        taskName,
                        priority,
                        dueDate
                );

        // If list is empty
        if (head == null) {

            head = newNode;
            newNode.next = head;
            current = head;

        } else {

            TaskNode1 last = head;

            // Find last node
            while (last.next != head) {
                last = last.next;
            }

            last.next = newNode;
            newNode.next = head;
        }

        System.out.println("Task added at the end.");
    }


    // 3. Add task at a specific position
    public void addAtPosition(int taskId,
                              String taskName,
                              int priority,
                              String dueDate,
                              int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Position 1 means beginning
        if (position == 1) {
            addAtBeginning(
                    taskId,
                    taskName,
                    priority,
                    dueDate
            );
            return;
        }

        if (head == null) {
            System.out.println("Invalid position.");
            return;
        }

        TaskNode1 newNode =
                new TaskNode1(
                        taskId,
                        taskName,
                        priority,
                        dueDate
                );

        TaskNode1 currentNode = head;

        // Move to node before required position
        for (int i = 1;
             i < position - 1 && currentNode.next != head;
             i++) {

            currentNode = currentNode.next;
        }

        // Check if position is valid
        if (currentNode.next == head && position > 2) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;

        System.out.println(
                "Task added at position " + position + "."
        );
    }


    // 4. Remove task by Task ID
    public void removeByTaskId(int taskId) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        // If only one node exists
        if (head.next == head) {

            if (head.taskId == taskId) {
                head = null;
                current = null;

                System.out.println(
                        "Task removed successfully."
                );
            } else {
                System.out.println("Task not found.");
            }

            return;
        }

        // If head needs to be removed
        if (head.taskId == taskId) {

            TaskNode1 last = head;

            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;

            if (current.taskId == taskId) {
                current = head;
            }

            System.out.println(
                    "Task removed successfully."
            );

            return;
        }

        // Find the node before target
        TaskNode1 previous = head;

        while (previous.next != head
                && previous.next.taskId != taskId) {

            previous = previous.next;
        }

        // Task not found
        if (previous.next == head) {
            System.out.println("Task not found.");
            return;
        }

        TaskNode1 nodeToDelete = previous.next;

        previous.next = nodeToDelete.next;

        if (current == nodeToDelete) {
            current = nodeToDelete.next;
        }

        System.out.println(
                "Task removed successfully."
        );
    }


    // 5. View current task
    public void viewCurrentTask() {

        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Current Task");
        System.out.println("------------");

        displayTask(current);
    }


    // 6. Move to next task
    public void moveToNextTask() {

        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        current = current.next;

        System.out.println("Moved to next task.");

        displayTask(current);
    }


    // 7. Display all tasks
    public void displayAllTasks() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode1 currentNode = head;

        System.out.println("All Tasks");
        System.out.println("=========");

        do {
            displayTask(currentNode);

            currentNode = currentNode.next;

        } while (currentNode != head);
    }


    // 8. Search task by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode1 currentNode = head;
        boolean found = false;

        do {

            if (currentNode.priority == priority) {

                displayTask(currentNode);
                found = true;
            }

            currentNode = currentNode.next;

        } while (currentNode != head);

        if (!found) {
            System.out.println(
                    "No task found with priority: "
                            + priority
            );
        }
    }


    // Display individual task
    private void displayTask(TaskNode1 task) {

        System.out.println("Task ID: " + task.taskId);
        System.out.println("Task Name: " + task.taskName);
        System.out.println("Priority: " + task.priority);
        System.out.println("Due Date: " + task.dueDate);
        System.out.println();
    }
}


// Main class
public class TaskScheduler {

    public static void main(String[] args) {

        TaskCircularList1 taskList =
                new TaskCircularList1();

        // Add task at beginning
        taskList.addAtBeginning(
                101,
                "Complete Java Assignment",
                1,
                "2026-10-10"
        );

        // Add task at end
        taskList.addAtEnd(
                102,
                "Study Data Structures",
                2,
                "2026-10-12"
        );

        // Add another task at end
        taskList.addAtEnd(
                103,
                "Prepare for Interview",
                1,
                "2026-10-15"
        );

        // Add task at position 2
        taskList.addAtPosition(
                104,
                "Complete Project",
                3,
                "2026-10-20",
                2
        );

        // Display all tasks
        System.out.println();
        taskList.displayAllTasks();

        // View current task
        System.out.println("Current Task");
        System.out.println("============");

        taskList.viewCurrentTask();

        // Move to next task
        System.out.println("Next Task");
        System.out.println("=========");

        taskList.moveToNextTask();

        // Move again
        System.out.println("Next Task");
        System.out.println("=========");

        taskList.moveToNextTask();

        // Search by priority
        System.out.println("Tasks with Priority 1");
        System.out.println("=====================");

        taskList.searchByPriority(1);

        // Remove task
        System.out.println("Remove Task");
        System.out.println("===========");

        taskList.removeByTaskId(102);

        // Display final list
        System.out.println("Tasks After Deletion");
        System.out.println("====================");

        taskList.displayAllTasks();
    }
}