/*Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
Add an item at the beginning, end, or at a specific position.
Remove an item based on Item ID.
Update the quantity of an item by Item ID.
        Search for an item based on Item ID or Item Name.
Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
Sort the inventory based on Item Name or Price in ascending or descending order.
Hint:
Use a singly linked list where each node represents an item in the inventory.
Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
For total value calculation, traverse through the list and sum up Quantity * Price for each item.
Author: Prakhar Khare
Date: 5-10-2026
 */
package LinkedList.SingleLinkedList;
// Node class
class InventoryNode1 {

    String itemName;
    int itemId;
    int quantity;
    double price;

    InventoryNode1 next;

    // Constructor
    InventoryNode1(String itemName, int itemId,
                   int quantity, double price) {

        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}


// Singly Linked List class
class InventoryLinkedList1 {

    InventoryNode1 head;

    // 1. Add item at beginning
    public void addAtBeginning(String itemName,
                               int itemId,
                               int quantity,
                               double price) {

        InventoryNode1 newNode =
                new InventoryNode1(
                        itemName,
                        itemId,
                        quantity,
                        price
                );

        newNode.next = head;
        head = newNode;

        System.out.println("Item added at the beginning.");
    }


    // 2. Add item at end
    public void addAtEnd(String itemName,
                         int itemId,
                         int quantity,
                         double price) {

        InventoryNode1 newNode =
                new InventoryNode1(
                        itemName,
                        itemId,
                        quantity,
                        price
                );

        // If list is empty
        if (head == null) {
            head = newNode;
            System.out.println("Item added at the end.");
            return;
        }

        InventoryNode1 current = head;

        // Move to last node
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println("Item added at the end.");
    }


    // 3. Add item at a specific position
    public void addAtPosition(String itemName,
                              int itemId,
                              int quantity,
                              double price,
                              int position) {

        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Position 1 means beginning
        if (position == 1) {
            addAtBeginning(
                    itemName,
                    itemId,
                    quantity,
                    price
            );
            return;
        }

        InventoryNode1 newNode =
                new InventoryNode1(
                        itemName,
                        itemId,
                        quantity,
                        price
                );

        InventoryNode1 current = head;

        // Move to node before required position
        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        // Invalid position
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println(
                "Item added at position " + position + "."
        );
    }


    // 4. Remove item by Item ID
    public void removeByItemId(int itemId) {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        // If first item needs to be removed
        if (head.itemId == itemId) {
            head = head.next;

            System.out.println(
                    "Item removed successfully."
            );

            return;
        }

        InventoryNode1 current = head;

        // Search for item
        while (current.next != null
                && current.next.itemId != itemId) {

            current = current.next;
        }

        // Item not found
        if (current.next == null) {
            System.out.println("Item not found.");
            return;
        }

        // Remove item
        current.next = current.next.next;

        System.out.println(
                "Item removed successfully."
        );
    }


    // 5. Update quantity by Item ID
    public void updateQuantity(int itemId,
                               int newQuantity) {

        InventoryNode1 current = head;

        while (current != null) {

            if (current.itemId == itemId) {

                current.quantity = newQuantity;

                System.out.println(
                        "Quantity updated successfully."
                );

                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }


    // 6. Search item by Item ID
    public void searchByItemId(int itemId) {

        InventoryNode1 current = head;

        while (current != null) {

            if (current.itemId == itemId) {

                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }


    // 7. Search item by Item Name
    public void searchByItemName(String itemName) {

        InventoryNode1 current = head;

        while (current != null) {

            if (current.itemName.equalsIgnoreCase(itemName)) {

                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }


    // 8. Calculate total inventory value
    public void calculateTotalValue() {

        InventoryNode1 current = head;
        double totalValue = 0;

        while (current != null) {

            totalValue =
                    totalValue
                            + (current.price * current.quantity);

            current = current.next;
        }

        System.out.println(
                "Total Inventory Value: " + totalValue
        );
    }


    // 9. Sort by Item Name
    public void sortByItemName(boolean ascending) {

        if (head == null || head.next == null) {
            return;
        }

        InventoryNode1 current = head;

        while (current != null) {

            InventoryNode1 nextNode = current.next;

            while (nextNode != null) {

                int comparison =
                        current.itemName.compareToIgnoreCase(
                                nextNode.itemName
                        );

                boolean shouldSwap;

                if (ascending) {
                    shouldSwap = comparison > 0;
                } else {
                    shouldSwap = comparison < 0;
                }

                if (shouldSwap) {
                    swapData(current, nextNode);
                }

                nextNode = nextNode.next;
            }

            current = current.next;
        }

        System.out.println("Inventory sorted by Item Name.");
    }


    // 10. Sort by Price
    public void sortByPrice(boolean ascending) {

        if (head == null || head.next == null) {
            return;
        }

        InventoryNode1 current = head;

        while (current != null) {

            InventoryNode1 nextNode = current.next;

            while (nextNode != null) {

                boolean shouldSwap;

                if (ascending) {
                    shouldSwap =
                            current.price > nextNode.price;
                } else {
                    shouldSwap =
                            current.price < nextNode.price;
                }

                if (shouldSwap) {
                    swapData(current, nextNode);
                }

                nextNode = nextNode.next;
            }

            current = current.next;
        }

        System.out.println("Inventory sorted by Price.");
    }


    // Swap data between two nodes
    private void swapData(InventoryNode1 first,
                          InventoryNode1 second) {

        String tempName = first.itemName;
        first.itemName = second.itemName;
        second.itemName = tempName;

        int tempId = first.itemId;
        first.itemId = second.itemId;
        second.itemId = tempId;

        int tempQuantity = first.quantity;
        first.quantity = second.quantity;
        second.quantity = tempQuantity;

        double tempPrice = first.price;
        first.price = second.price;
        second.price = tempPrice;
    }


    // Display all inventory items
    public void displayInventory() {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        InventoryNode1 current = head;

        System.out.println("Inventory Records");
        System.out.println("-----------------");

        while (current != null) {

            displayItem(current);

            current = current.next;
        }
    }


    // Display one item
    private void displayItem(InventoryNode1 item) {

        System.out.println("Item Name: " + item.itemName);
        System.out.println("Item ID: " + item.itemId);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Price: " + item.price);
        System.out.println(
                "Item Value: "
                        + (item.price * item.quantity)
        );
        System.out.println();
    }
}


// Main class
public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryLinkedList1 inventory =
                new InventoryLinkedList1();

        // Add item at beginning
        inventory.addAtBeginning(
                "Laptop",
                101,
                5,
                50000
        );

        // Add item at end
        inventory.addAtEnd(
                "Mouse",
                102,
                10,
                800
        );

        // Add another item at end
        inventory.addAtEnd(
                "Keyboard",
                103,
                7,
                1500
        );

        // Add item at position 2
        inventory.addAtPosition(
                "Monitor",
                104,
                4,
                12000,
                2
        );

        // Display inventory
        System.out.println();
        inventory.displayInventory();

        // Search by Item ID
        System.out.println("Search by Item ID");
        System.out.println("=================");

        inventory.searchByItemId(103);

        // Search by Item Name
        System.out.println("Search by Item Name");
        System.out.println("===================");

        inventory.searchByItemName("Laptop");

        // Update quantity
        System.out.println("Update Quantity");
        System.out.println("===============");

        inventory.updateQuantity(102, 20);

        // Calculate total value
        System.out.println();
        System.out.println("Total Inventory Value");
        System.out.println("=====================");

        inventory.calculateTotalValue();

        // Sort by item name ascending
        System.out.println();
        System.out.println("Sort By Item Name - Ascending");
        System.out.println("=============================");

        inventory.sortByItemName(true);
        inventory.displayInventory();

        // Sort by price descending
        System.out.println("Sort By Price - Descending");
        System.out.println("==========================");

        inventory.sortByPrice(false);
        inventory.displayInventory();

        // Remove item
        System.out.println("Remove Item");
        System.out.println("===========");

        inventory.removeByItemId(103);

        // Display final inventory
        System.out.println();
        inventory.displayInventory();
    }
}
