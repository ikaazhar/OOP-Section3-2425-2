public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        // Task 3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        // Task 6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        // Task 7
        Employee emp = new Employee();
        emp.setSalary(5000);
        System.out.println("Salary: " + emp.getSalary());
    }
}

// Task 1
class Employee {
    private int employeeNumber;
    private String employeeName;
    // Note: Making salary private
    private double salary;

    public int getEmpNum() {
        return employeeNumber;
    }

    public String getEmpName() {
        return employeeName;
    }

    public void setEmpNum(int empNumber) {
        this.employeeNumber = empNumber;
    }

    public void setEmpName(String empName) {
        this.employeeName = empName;
    }

    // Set and get salary
    public void setSalary(double empSalary) {
        this.salary = empSalary;
    }

    public double getSalary() {
        return salary;
    }
}

// Task 2
class Car {
    // Define private attributes
    private String brand;
    private int year;

    // Setter for brand
    public void setBrand(String carBrand) {
        this.brand = carBrand;
    }

    // Getter for year
    public int getYear() {
        return year;
    }
}

// Task 3
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Task 4
class Student {
    private String name;
    private int age;

    // Setter for name
    public void setName(String studentName) {
        this.name = studentName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

// Task 5
class Message {
    // Method that prints "Hello!"
    public void display() {
        System.out.println("Hello!");
    }

    // Overloaded method that prints custom message
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

// Task 6
class User {
    // Static variable to keep track of users
    private static int count = 0;

    public User() {
        // Increment user count
        count++;
    }

    public static int getUserCount() {
        return count;
    }
}
