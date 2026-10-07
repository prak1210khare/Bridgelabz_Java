/*Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
        Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes
Author:Prakhar Khare
Date: 6-10-2026
 */

package LinkedList.SingleLinkedList;
import java.util.Scanner;

// Node class
class StudentNode {

    int rollNumber;
    String name;
    int age;
    String grade;

    StudentNode next;

    // Constructor
    StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// Singly Linked List class
class StudentLinkedList {

    StudentNode head;

    // 1. Add student at the beginning
    public void addAtBeginning(int rollNumber, String name,
                               int age, String grade) {

        StudentNode newNode =
                new StudentNode(rollNumber, name, age, grade);

        newNode.next = head;
        head = newNode;

        System.out.println("Student added at the beginning.");
    }

    // 2. Add student at the end
    public void addAtEnd(int rollNumber, String name,
                         int age, String grade) {

        StudentNode newNode =
                new StudentNode(rollNumber, name, age, grade);

        // If list is empty
        if (head == null) {
            head = newNode;
            System.out.println("Student added at the end.");
            return;
        }

        StudentNode current = head;

        // Move to the last node
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println("Student added at the end.");
    }

    // 3. Add student at a specific position
    public void addAtPosition(int rollNumber, String name,
                              int age, String grade,
                              int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Position 1 means beginning
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }

        StudentNode newNode =
                new StudentNode(rollNumber, name, age, grade);

        StudentNode current = head;

        // Move to the node before the required position
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        // Position is greater than list size
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println("Student added at position " + position + ".");
    }

    // 4. Delete student by Roll Number
    public void deleteByRollNumber(int rollNumber) {

        // If list is empty
        if (head == null) {
            System.out.println("Student list is empty.");
            return;
        }

        // If student is the first node
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student deleted successfully.");
            return;
        }

        StudentNode current = head;

        // Search for the student
        while (current.next != null
                && current.next.rollNumber != rollNumber) {

            current = current.next;
        }

        // Student not found
        if (current.next == null) {
            System.out.println("Student not found.");
            return;
        }

        // Remove the node
        current.next = current.next.next;

        System.out.println("Student deleted successfully.");
    }

    // 5. Search student by Roll Number
    public void searchByRollNumber(int rollNumber) {

        StudentNode current = head;

        while (current != null) {

            if (current.rollNumber == rollNumber) {

                System.out.println("Student found.");
                System.out.println("Roll Number: " + current.rollNumber);
                System.out.println("Name: " + current.name);
                System.out.println("Age: " + current.age);
                System.out.println("Grade: " + current.grade);

                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // 6. Display all students
    public void displayStudents() {

        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode current = head;

        System.out.println("\nStudent Records");
        System.out.println("----------------");

        while (current != null) {

            System.out.println("Roll Number: " + current.rollNumber);
            System.out.println("Name: " + current.name);
            System.out.println("Age: " + current.age);
            System.out.println("Grade: " + current.grade);
            System.out.println();

            current = current.next;
        }
    }

    // 7. Update student's grade
    public void updateGrade(int rollNumber, String newGrade) {

        StudentNode current = head;

        while (current != null) {

            if (current.rollNumber == rollNumber) {

                current.grade = newGrade;

                System.out.println(
                        "Grade updated successfully."
                );

                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }
}


// Main class
public class StudentRecords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentLinkedList studentList =
                new StudentLinkedList();

        // Add students at different positions
        studentList.addAtBeginning(
                101, "Prakhar", 21, "A"
        );

        studentList.addAtEnd(
                102, "Rahul", 22, "B"
        );

        studentList.addAtEnd(
                103, "Amit", 20, "A"
        );

        studentList.addAtPosition(
                104, "Rohit", 21, "A+",
                2
        );

        // Display all students
        studentList.displayStudents();

        // Search student
        System.out.println("Searching for Roll Number 102:");
        studentList.searchByRollNumber(102);

        System.out.println();

        // Update grade
        System.out.println("Updating Grade:");
        studentList.updateGrade(102, "A");

        System.out.println();

        // Display after grade update
        studentList.displayStudents();

        // Delete student
        System.out.println("Deleting Roll Number 103:");
        studentList.deleteByRollNumber(103);

        System.out.println();

        // Display after deletion
        studentList.displayStudents();

        input.close();
    }
}
