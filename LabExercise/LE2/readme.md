# 📘 OOP Lab Exercise 2 - Questions


## ONCE FINISH ALL QUESTIONS.. COMBINE AND TUNE IT ALL IN 1 .JAVA FILE (COMPILABLE AND EXECUTABLE)


---

## 🔹 Q1: Class and Object Creation

**Instruction:**  
Create an `Employee` class with attributes and methods. The code below is incomplete. Fix it so that it creates an object and prints employee data.

```java
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());
    }
}

class Employee {
    // TODO: Add fields
    // TODO: Add setter and getter methods
}
```

---

## 🔹 Q2: Instance Variables and Data Fields

**Instruction:**  
Fill in the missing parts to declare instance variables properly and ensure encapsulation.

```java
class Car {
    // TODO: Declare two private instance variables (brand and year)

    // TODO: Create setter for brand

    // TODO: Create getter for year
}
```

---

## 🔹 Q3: Constructor Usage

**Instruction:**  
Fix the code to use a parameterized constructor to initialize a `Book` object.

```java
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();
    }
}

class Book {
    private String title;
    private String author;

    // TODO: Add a constructor

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
```

---

## 🔹 Q4: Getters and Setters

**Instruction:**  
Complete the `Student` class by implementing proper getter and setter methods.

```java
class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name

    // TODO: Implement getter for age
}
```

---

## 🔹 Q5: Method Overloading

**Instruction:**  
The following class should use method overloading to display a message with and without a parameter.

```java
class Message {
    // TODO: Write a method display() that prints "Hello!"
    // TODO: Overload display(String msg) to print "Message: msg"
}
```

---

## 🔹 Q6: Static vs Non-Static

**Instruction:**  
Fix the following code to keep track of how many objects of `User` have been created.

```java
class User {
    // TODO: Declare a static counter variable

    public User() {
        // TODO: Increment counter
    }

    public static int getUserCount() {
        // TODO: Return counter
    }
}

public class Main {
    public static void main(String[] args) {
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());
    }
}
```

---

## 🔹 Q7: Access Modifiers

**Instruction:**  
Fix the code below to ensure the salary field is private and accessible only through methods.

```java
class Employee {
    // TODO: Make salary private

    // TODO: Write setSalary() and getSalary() methods
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}
```

---

# ✅ OOP Lab Exercise - Sample Answers

---

## ✅ Q1: Class and Object Creation

```java
class Employee {
    private int empNum;
    private String empName;

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
}
```

---

## ✅ Q2: Instance Variables and Data Fields

```java
class Car {
    private String brand;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
}
```

---

## ✅ Q3: Constructor Usage

```java
class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
```

---

## ✅ Q4: Getters and Setters

```java
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
```

---

## ✅ Q5: Method Overloading

```java
class Message {
    public void display() {
        System.out.println("Hello!");
    }

    public void display(String msg) {
        System.out.println("Message: " + msg);
    }
}
```

---

## ✅ Q6: Static vs Non-Static

```java
class User {
    private static int counter = 0;

    public User() {
        counter++;
    }

    public static int getUserCount() {
        return counter;
    }
}
```

---

## ✅ Q7: Access Modifiers

```java
class Employee {
    private int salary;

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}
```

