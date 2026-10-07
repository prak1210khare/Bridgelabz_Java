/*7. Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
        Search for a user by Name or User ID.
Count the number of friends for each user.
Hint:
Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
For mutual friends, traverse both lists and compare the Friend IDs.
The List of Friend IDs for each user can be implemented as a nested linked list or array.
Author: Prakhar Khare
Date: 5-10-2026
 */
package LinkedList.SingleLinkedList;
import java.util.ArrayList;

// Node representing a user
class UserNode1 {

    int userId;
    String name;
    int age;

    // Stores IDs of friends
    ArrayList<Integer> friendIds;

    UserNode1 next;

    UserNode1(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

// Singly linked list containing users
class UserLinkedList1 {

    UserNode1 head;

    // Add a new user at the end
    public void addUser(int userId, String name, int age) {

        UserNode1 newUser =
                new UserNode1(userId, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode1 current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newUser;
    }

    // Find a user by User ID
    public UserNode1 findUserById(int userId) {

        UserNode1 current = head;

        while (current != null) {

            if (current.userId == userId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Search user by name
    public void searchByName(String name) {

        UserNode1 current = head;
        boolean found = false;

        while (current != null) {

            if (current.name.equalsIgnoreCase(name)) {

                System.out.println("User Found:");
                displayUser(current);

                found = true;
            }

            current = current.next;
        }

        if (!found) {
            System.out.println(
                    "No user found with name: " + name
            );
        }

        System.out.println();
    }

    // Search user by ID
    public void searchById(int userId) {

        UserNode1 user = findUserById(userId);

        if (user != null) {

            System.out.println("User Found:");
            displayUser(user);

        } else {

            System.out.println(
                    "No user found with User ID: " + userId
            );
        }

        System.out.println();
    }

    // Add a friend connection between two users
    public void addFriend(int userId1, int userId2) {

        UserNode1 user1 = findUserById(userId1);
        UserNode1 user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {

            System.out.println(
                    "One or both users do not exist."
            );

            return;
        }

        if (userId1 == userId2) {

            System.out.println(
                    "A user cannot be friends with themselves."
            );

            return;
        }

        // Add user2 to user1's friend list
        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }

        // Add user1 to user2's friend list
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }

        System.out.println(
                "Friend connection added between "
                        + user1.name + " and " + user2.name
        );
    }

    // Remove a friend connection
    public void removeFriend(int userId1, int userId2) {

        UserNode1 user1 = findUserById(userId1);
        UserNode1 user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {

            System.out.println(
                    "One or both users do not exist."
            );

            return;
        }

        boolean removed1 =
                user1.friendIds.remove(Integer.valueOf(userId2));

        boolean removed2 =
                user2.friendIds.remove(Integer.valueOf(userId1));

        if (removed1 || removed2) {

            System.out.println(
                    "Friend connection removed between "
                            + user1.name + " and " + user2.name
            );

        } else {

            System.out.println(
                    "No friend connection exists between "
                            + user1.name + " and " + user2.name
            );
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {

        UserNode1 user = findUserById(userId);

        if (user == null) {

            System.out.println(
                    "User not found."
            );

            return;
        }

        System.out.println(
                "Friends of " + user.name + ":"
        );

        if (user.friendIds.isEmpty()) {

            System.out.println("No friends.");

            return;
        }

        for (int friendId : user.friendIds) {

            UserNode1 friend =
                    findUserById(friendId);

            if (friend != null) {

                System.out.println(
                        "User ID: " + friend.userId
                                + ", Name: " + friend.name
                                + ", Age: " + friend.age
                );
            }
        }

        System.out.println();
    }

    // Find mutual friends between two users
    public void findMutualFriends(
            int userId1,
            int userId2) {

        UserNode1 user1 = findUserById(userId1);
        UserNode1 user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {

            System.out.println(
                    "One or both users do not exist."
            );

            return;
        }

        System.out.println(
                "Mutual Friends of "
                        + user1.name
                        + " and "
                        + user2.name
                        + ":"
        );

        boolean found = false;

        // Traverse first user's friend list
        for (int friendId : user1.friendIds) {

            // Check whether the same friend exists
            // in second user's friend list
            if (user2.friendIds.contains(friendId)) {

                UserNode1 mutualFriend =
                        findUserById(friendId);

                if (mutualFriend != null) {

                    System.out.println(
                            "User ID: "
                                    + mutualFriend.userId
                                    + ", Name: "
                                    + mutualFriend.name
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No mutual friends.");
        }

        System.out.println();
    }

    // Count friends for every user
    public void countFriends() {

        UserNode1 current = head;

        System.out.println(
                "===== Friend Count ====="
        );

        while (current != null) {

            System.out.println(
                    current.name
                            + " (User ID: "
                            + current.userId
                            + ") has "
                            + current.friendIds.size()
                            + " friend(s)."
            );

            current = current.next;
        }

        System.out.println();
    }

    // Display all users
    public void displayAllUsers() {

        UserNode1 current = head;

        System.out.println(
                "===== All Users ====="
        );

        while (current != null) {

            displayUser(current);
            current = current.next;
        }

        System.out.println();
    }

    // Display one user
    private void displayUser(UserNode1 user) {

        System.out.println(
                "User ID: " + user.userId
                        + ", Name: " + user.name
                        + ", Age: " + user.age
                        + ", Number of Friends: "
                        + user.friendIds.size()
        );
    }
}

// Main class
public class SocialMediaFriends {

    public static void main(String[] args) {

        UserLinkedList1 socialMedia =
                new UserLinkedList1();

        // Add users
        socialMedia.addUser(
                101, "Prakhar", 21
        );

        socialMedia.addUser(
                102, "Rahul", 22
        );

        socialMedia.addUser(
                103, "Amit", 20
        );

        socialMedia.addUser(
                104, "Rohit", 21
        );

        socialMedia.addUser(
                105, "Neha", 22
        );

        System.out.println();

        // Display all users
        socialMedia.displayAllUsers();

        // Add friend connections
        socialMedia.addFriend(101, 102);
        socialMedia.addFriend(101, 103);
        socialMedia.addFriend(101, 104);

        socialMedia.addFriend(102, 103);
        socialMedia.addFriend(102, 104);

        socialMedia.addFriend(103, 105);

        System.out.println();

        // Display friends of Prakhar
        socialMedia.displayFriends(101);

        // Display friends of Rahul
        socialMedia.displayFriends(102);

        // Find mutual friends
        socialMedia.findMutualFriends(101, 102);

        // Search by name
        socialMedia.searchByName("Amit");

        // Search by User ID
        socialMedia.searchById(104);

        // Count friends for each user
        socialMedia.countFriends();

        // Remove a friend connection
        socialMedia.removeFriend(101, 104);

        System.out.println();

        // Display updated friends
        socialMedia.displayFriends(101);

        // Display updated friend counts
        socialMedia.countFriends();
    }
}
