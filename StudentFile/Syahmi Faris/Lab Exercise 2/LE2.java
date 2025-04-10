public class LE2 {
    public static void main(String[] args) {
        //Question 1
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        //Question 3
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        //Question 6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        //Question 7
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

//Question 1
class Employee {
    // TODO: Add fields
    private int empNum;
    private String empName;

    // TODO: Add setter and getter methods
    public void setEmpNum(int num) {
        empNum = num;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public String getEmpName() {
        return empName;  
    }

    //Question 7
    private int salary;
    // TODO: Make salary private
    public void setSalary(int s) {
        salary = s;
    }

    // TODO: Write setSalary() and getSalary() methods
    public int getSalary() {
        return salary;
    }
}

//Question 2
class Car {
    // TODO: Declare two private instance variables (brand and year)
    private String carbrand;
    private int caryear;

    // TODO: Create setter for brand
    public void setCarBrand(String brand) {
        carbrand = brand;
    }

    // TODO: Create getter for year
    public int getCarYear() {
        return caryear;
    }
}

//Question 3
class Book {
    private String title;
    private String author;

    // TODO: Add a constructor
    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//Question 4
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name
    public void setStudName(String n) {
        name = n;
    }

    // TODO: Implement getter for age
    public int getStudAge() {
        return age;
    }
}

//Question 5
class Message {
    // TODO: Write a method display() that prints "Hello!"
    public void display(){
        System.out.println("Hello!");
    }
    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}

//Question 6
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
