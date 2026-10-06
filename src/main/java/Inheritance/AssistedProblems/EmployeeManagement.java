/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
        Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Author: Prakhar Khare
Date: 3-10-2026
 */

package Inheritance.AssistedProblems;
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("id"+id);
        System.out.println("Salary "+salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void display(){
        super.display();
        System.out.println("teamSize"+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Prog"+programmingLanguage);
    }}
    class Intern extends Employee{
        int duration;
        Intern(String name,int id,double salary,int duration){
            super(name,id,salary);
            this.duration=duration;
        }
        void display(){
            super.display();
            System.out.println("duration"+duration);
        }
    }


public class EmployeeManagement {
    public static void main(String[] args){
    Manager m1 = new Manager("Prakhar", 101, 5000, 5);
    Developer d1 = new Developer("Rohan", 103, 60000, "Java");
    Intern I1 = new Intern("Rahul", 203, 40000, 6);
    m1.display();
    d1.display();
    I1.display();
}}
