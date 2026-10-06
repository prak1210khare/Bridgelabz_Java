/*Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
        Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Author: Prakhar Khare
Date: 4-10-2026
 */
package Inheritance.HybridInheritance;
interface Worker{
    void performDuties();
}
class Person{
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("Id "+id);
    }
}
class Chef extends Person implements Worker{
    Chef(String name,int id){
        super(name,id);
    }
    @Override
    public void performDuties(){
        System.out.println("Preparing food");
    }
}
class Waiter extends Person implements Worker{
    Waiter(String name,int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Serving food");
    }
}

public class RestaurantManagement {
    public static void main(String[] args){
        Chef c1=new Chef("Prakhar",103);
        Waiter w1=new Waiter("Aayush",203);
        System.out.println("Chef details");
        c1.display();
        c1.performDuties();
        System.out.println();
        System.out.println("Waiter Details");
        w1.display();
        w1.performDuties();
    }
}
