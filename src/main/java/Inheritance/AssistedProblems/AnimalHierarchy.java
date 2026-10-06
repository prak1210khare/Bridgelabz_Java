/*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Auhtor: Prakhar Khare
Date: 3-10-2026
 */
package Inheritance.AssistedProblems;
class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}
class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("Dog says whoof whoof");
    }
}
class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("Cat says meow meow");
    }
}
class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("Bird says Chirp Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[]args){
        Dog dog=new Dog("Bruno",5);
        Cat cat=new Cat("Kitty",8);
        Bird bird=new Bird("Kido",4);
        dog.display();
        dog.makeSound();
        cat.display();
        cat.makeSound();
        bird.display();
        bird.makeSound();
    }
}
