
//Name: Teh Ru Qian A23CS0191
//Lab Exercise 2

public class Main {
    public static void main(String[] args) {
        //Q1: Class and Object Creation
        System.out.println("Q1: Class and Object Creation");

        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());
        
        System.out.println("\nQ2: Instance Variables and Data Fields - No Output");

        //Q3: Constructor Usage
        System.out.println("\nQ3: Constructor Usage");

        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        System.out.println("\nQ4: Getters and Setters - No Output");
        System.out.println("\nQ5: Method Overloading - No Output");

        //Q6: Static vs Non-Static
        System.out.println("\nQ6: Static vs Non-Static");

        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        //Q7: Access Modifiers
        System.out.println("\nQ7: Access Modifiers");
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

class Employee {
    //Q1: Class and Object Creation
    // TODO: Add fields
    private int empNum;
    private String empName;

    // TODO: Add setter and getter methods
    public void setEmpNum (int num){
        empNum = num;
    }

    public void setEmpName (String name){
        empName = name;
    }

    public int getEmpNum (){
        return empNum;
    }

    public String getEmpName(){
        return empName;
    }

    //Q7: Access Modifiers
    // TODO: Make salary private
    private int salary;

    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(int s){
        salary = s;
    }
    public int getSalary(){
        return salary;
    }
}

//Q2: Instance Variables and Data Fields
class Car {
    // TODO: Declare two private instance variables (brand and year)
    private String brand;
    private int year;

    // TODO: Create setter for brand
    public void setBrand(String b){
        brand = b;
    }

    // TODO: Create getter for year
    public int getYear(){
        return year;
    }
}

//Q3: Constructor Usage
class Book {
    private String title;
    private String author;

    // TODO: Add a constructor
    public Book(String t, String a){
        title = t;
        author = a;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//Q4: Getters and Setters
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name
    public void setName(String n){
        name = n;
    }

    // TODO: Implement getter for age
    public int getAge(){
        return age;
    }
}

//Q5: Method Overloading
class Message {
    // TODO: Write a method display() that prints "Hello!"
    public void display() {
        System.out.println("Hello");
    }

    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

//Q6: Static vs Non-Static
class User {
    // TODO: Declare a static counter variable
    private static int counter = 0;

    public User() {
        // TODO: Increment counter
        counter++;
    }

    public static int getUserCount() {
        // TODO: Return counter
        return counter; 
    }
}

