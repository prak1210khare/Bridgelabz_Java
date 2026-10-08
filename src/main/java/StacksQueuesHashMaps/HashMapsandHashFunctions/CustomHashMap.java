/*Implement a Custom Hash Map
Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint: Use an array of linked lists to handle collisions using separate chaining
Author: Prakhar Khare
Date: 7-10-2026
 */

package StacksQueuesHashMaps.HashMapsandHashFunctions;
// Node used to store key-value pairs
class HashNode1 {

    int key;
    String value;

    HashNode1 next;

    HashNode1(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

// Custom HashMap implementation
class CustomHashMap1 {

    // Array of linked lists
    HashNode1[] buckets;

    // Number of buckets
    int capacity;

    CustomHashMap1(int capacity) {
        this.capacity = capacity;
        buckets = new HashNode1[capacity];
    }

    // Generate hash index
    private int getIndex(int key) {

        return Math.abs(key) % capacity;
    }

    // Insert a key-value pair
    public void put(int key, String value) {

        int index = getIndex(key);

        HashNode1 current = buckets[index];

        // Check if key already exists
        while (current != null) {

            if (current.key == key) {

                // Update existing value
                current.value = value;

                System.out.println(
                        "Key " + key
                                + " updated successfully."
                );

                return;
            }

            current = current.next;
        }

        // Create a new node
        HashNode1 newNode =
                new HashNode1(key, value);

        // Insert at beginning of linked list
        newNode.next = buckets[index];

        buckets[index] = newNode;

        System.out.println(
                "Key " + key
                        + " inserted successfully."
        );
    }

    // Retrieve value using key
    public String get(int key) {

        int index = getIndex(key);

        HashNode1 current = buckets[index];

        // Search linked list
        while (current != null) {

            if (current.key == key) {

                return current.value;
            }

            current = current.next;
        }

        return null;
    }

    // Delete a key-value pair
    public void remove(int key) {

        int index = getIndex(key);

        HashNode1 current = buckets[index];
        HashNode1 previous = null;

        // Search for the key
        while (current != null) {

            if (current.key == key) {

                // If node is the first node
                if (previous == null) {

                    buckets[index] = current.next;

                } else {

                    // Remove node from linked list
                    previous.next = current.next;
                }

                System.out.println(
                        "Key " + key
                                + " removed successfully."
                );

                return;
            }

            previous = current;
            current = current.next;
        }

        System.out.println(
                "Key " + key
                        + " not found."
        );
    }

    // Display the complete HashMap
    public void display() {

        System.out.println(
                "\n===== Custom HashMap ====="
        );

        for (int i = 0; i < capacity; i++) {

            System.out.print(
                    "Bucket " + i + ": "
            );

            HashNode1 current = buckets[i];

            if (current == null) {

                System.out.println("Empty");

            } else {

                while (current != null) {

                    System.out.print(
                            "[" + current.key
                                    + " = " + current.value + "]"
                    );

                    if (current.next != null) {
                        System.out.print(" -> ");
                    }

                    current = current.next;
                }

                System.out.println();
            }
        }
    }
}

// Main class
public class CustomHashMap {

    public static void main(String[] args) {

        // Create custom HashMap
        CustomHashMap1 map =
                new CustomHashMap1(5);

        // Insert key-value pairs
        map.put(1, "Prakhar");
        map.put(2, "Rahul");
        map.put(7, "Amit");
        map.put(12, "Neha");

        // Display map
        map.display();

        // Retrieve values
        System.out.println(
                "\nValue for key 1: "
                        + map.get(1)
        );

        System.out.println(
                "Value for key 7: "
                        + map.get(7)
        );

        // Update an existing key
        map.put(1, "Prakhar Khare");

        System.out.println(
                "\nUpdated value for key 1: "
                        + map.get(1)
        );

        // Remove a key
        map.remove(7);

        // Display updated map
        map.display();

        // Try to retrieve deleted key
        System.out.println(
                "\nValue for key 7: "
                        + map.get(7)
        );
    }
}
