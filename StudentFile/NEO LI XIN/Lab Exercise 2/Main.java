public class Main {
    public static void main(String[] args) {
        // Pick which question to run here:
        // Q1_Class_and_Object_Creation.run();
        // Q3_Constructor_Usage.run();
        // Q5_Method_Overloading.run();
        // Q6_Static_vs_Non_Static.run();
        // Q7_Access_Modifiers.run();  // <-- Example: running Q7
    }
}

//Q1---------------------------------------------------------
class Q1_Class_and_Object_Creation {  //file name
    public static void run() {
        Employee1 e1 = new Employee1();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());
    }
}

class Employee1 {
    // TODO: Add fields/variables
    public int empNum;
    public String empName;

    // TODO: Add setter and getter methods
    public void setEmpNum(int num){
        this.empNum = num;
    }

    public void setEmpName(String name){
        this.empName = name;
    }

    public int getEmpNum(){
        return empNum;
    }
    
    public String getEmpName(){
        return empName;
    }
}

//Q2---------------------------------------------------------
class Car {
    // TODO: Declare two private instance variables (brand and year)
    private String brand;  //use private for proper encapsulation
    private int year;

    // TODO: Create setter for brand
    public void setBrand(String brand){
        this.brand = brand;
    }

    // TODO: Create getter for year
    public int getYear(){
        return year;
    }
}

//Q3---------------------------------------------------------
class Q3_Constructor_Usage {
    public static void run() {
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();
    }
}

class Book {
    private String title;
    private String author;

    // TODO: Add a constructor
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//Q4---------------------------------------------------------
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name
    public void setName (String name){
        this.name = name;
    }
    
    // TODO: Implement getter for age
    public int getAge (){
        return age;
    }
}

//Q5---------------------------------------------------------
class Message {
    // TODO: Write a method display() that prints "Hello!"
    public void display(){
        System.out.println("Hello!");
    }

    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg){
        System.out.println("Message: " + msg);
    }
}

class Q5_Method_Overloading{ //Testing
    public static void run(){ 
        Message m1 = new Message(); 
        m1.display("What's Up!");
        m1.display();
    }
}

//Q6---------------------------------------------------------
class User {
    // TODO: Declare a static counter variable
    static int noOfUsers = 0;

    public User() {
        // TODO: Increment counter
        User.noOfUsers++;
    }

    public static int getUserCount() {
        // TODO: Return counter
        return User.noOfUsers;
    }
}

class Q6_Static_vs_Non_Static {
    public static void run() {
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());
    }
}

//Q7---------------------------------------------------------
class Employee2 {
    // TODO: Make salary private
    private int salary;  

    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}

class Q7_Access_Modifiers {
    public static void run() {
        Employee2 e = new Employee2();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}


