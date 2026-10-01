/*Create a Person class with a copy constructor that clones another person's attributes.
Author: Prakhar Khare
Date: 1-10-2026
 */
package javaConstructors.level1;

public class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person original) {
        name = original.name;
        age = original.age;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Prakhar", 21);

        // Copy person1 into person2
        Person person2 = new Person(person1);

        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);
    }
}
