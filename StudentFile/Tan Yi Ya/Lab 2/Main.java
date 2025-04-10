public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        //Q3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        //Q6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        //Q7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }

}

//Q1
class Employee {
    private int EmpNum;
    private String EmpName;
    // TODO: Make salary private
    private double salary;

    public int getEmpNum() {
        return EmpNum;
    }
    public String getEmpName(){
        return EmpName;
    }

    public void setEmpNum(int EmpNum) {
        this.EmpNum = EmpNum;
    }
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

//Q2
class Car {
    // TODO: Declare two private instance variables (brand and year)
    private String brand;
    private int year;

    // TODO: Create setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // TODO: Create getter for year
    public int getYear() {
        return year;
    }
}

// Q3
class Book {
    private String title;
    private String author;

    // TODO: Add a constructor
    public Book(String b_title, String b_author) {
        title = b_title;
        author = b_author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Q4
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name
    public void setName(String s_name) {
        this.name = s_name;
    }

    // TODO: Implement getter for age
    public int getAge() {
        return age;
    }
}

// Q5
class Message {
    // TODO: Write a method display() that prints "Hello!"
    public void display() {
        System.out.println("Hello!");
    }
    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

// Q6
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
