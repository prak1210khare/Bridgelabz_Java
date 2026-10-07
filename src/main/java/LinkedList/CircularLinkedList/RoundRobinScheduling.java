/*6. Circular Linked List: Round Robin Scheduling Algorithm
Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
Add a new process at the end of the circular list.
Remove a process by Process ID after its execution.
Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
Display the list of processes in the circular queue after each round.
Calculate and display the average waiting time and turn-around time for all processes.
Hint:
Use a circular linked list to represent a queue of processes.
Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
Maintain the current node as the process being executed, and after each round, update the list to simulate execution.
Auhtor: Prakhar Khare
Date: 5-10-2026
 */

package LinkedList.CircularLinkedList;
class ProcessNode1 {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int completionTime;
    ProcessNode1 next;

    ProcessNode1(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.completionTime = 0;
        this.next = null;
    }
}

class RoundRobinCircularList1 {

    ProcessNode1 head;
    ProcessNode1 tail;
    ProcessNode1 current;

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {

        ProcessNode1 newNode =
                new ProcessNode1(processId, burstTime, priority);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            current = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {

        if (head == null) {
            return;
        }

        ProcessNode1 currentNode = head;
        ProcessNode1 previous = tail;

        do {
            if (currentNode.processId == processId) {

                // Only one process in the list
                if (head == tail) {
                    head = null;
                    tail = null;
                    current = null;
                    return;
                }

                // Removing head
                if (currentNode == head) {
                    head = head.next;
                    tail.next = head;

                    if (current == currentNode) {
                        current = head;
                    }
                } else {
                    previous.next = currentNode.next;

                    // Removing tail
                    if (currentNode == tail) {
                        tail = previous;
                        tail.next = head;
                    }

                    if (current == currentNode) {
                        current = currentNode.next;
                    }
                }

                return;
            }

            previous = currentNode;
            currentNode = currentNode.next;

        } while (currentNode != head);
    }

    // Display all processes currently in the circular queue
    public void displayProcesses() {

        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode1 currentNode = head;

        System.out.println("Processes in Circular Queue:");

        do {
            System.out.println(
                    "Process ID: " + currentNode.processId
                            + ", Burst Time: " + currentNode.burstTime
                            + ", Remaining Time: " + currentNode.remainingTime
                            + ", Priority: " + currentNode.priority
            );

            currentNode = currentNode.next;

        } while (currentNode != head);

        System.out.println();
    }

    // Simulate Round Robin scheduling
    public void scheduleProcesses(int timeQuantum) {

        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;

        System.out.println("===== Round Robin Scheduling =====");
        System.out.println("Time Quantum: " + timeQuantum);
        System.out.println();

        while (head != null) {

            // Store the starting process of this round
            ProcessNode1 roundStart = current;

            do {

                // Check whether the process still needs CPU time
                if (current.remainingTime > 0) {

                    System.out.println(
                            "Executing Process " + current.processId
                                    + " for " + Math.min(
                                    timeQuantum,
                                    current.remainingTime
                            ) + " units"
                    );

                    // Execute process for the time quantum
                    int executionTime =
                            Math.min(timeQuantum, current.remainingTime);

                    current.remainingTime -= executionTime;
                    currentTime += executionTime;

                    // Process has completed
                    if (current.remainingTime == 0) {

                        current.completionTime = currentTime;

                        System.out.println(
                                "Process " + current.processId
                                        + " completed at time "
                                        + currentTime
                        );

                        int completedProcessId = current.processId;

                        // Save next process before removing current
                        ProcessNode1 nextProcess = current.next;

                        removeProcess(completedProcessId);

                        if (head == null) {
                            break;
                        }

                        current = nextProcess;

                    } else {
                        // Move to next process
                        current = current.next;
                    }
                } else {
                    current = current.next;
                }

                if (head == null) {
                    break;
                }

            } while (current != roundStart);

            // Display remaining processes after each round
            if (head != null) {
                System.out.println("\nProcesses after this round:");
                displayProcesses();
            }
        }
    }
}

public class RoundRobinScheduling {

    public static void main(String[] args) {

        RoundRobinCircularList1 scheduler =
                new RoundRobinCircularList1();

        // Add processes
        scheduler.addProcess(101, 8, 1);
        scheduler.addProcess(102, 5, 2);
        scheduler.addProcess(103, 10, 1);
        scheduler.addProcess(104, 6, 3);

        System.out.println("Initial Process Queue:");
        scheduler.displayProcesses();

        // Set time quantum
        int timeQuantum = 3;

        // Start Round Robin scheduling
        scheduler.scheduleProcesses(timeQuantum);
    }
}
