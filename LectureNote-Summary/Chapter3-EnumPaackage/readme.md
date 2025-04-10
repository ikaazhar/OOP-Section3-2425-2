Here's the full reworked note for **Chapter 3** covering **Enumerated Types** and **Packages in Java**, with key points highlighted, sample code snippets for each concept, and one complete code example at the end that demonstrates all concepts in a single program. The code is fully commented for educational clarity.

---

```markdown
# Chapter 3: Enumerated Types and Packages in Java

---

## 🔶 Enumerated Types (Enum)

### ✅ What is Enum?
- An `enum` is a **special kind of class** used to define a **collection of constants**.
- Syntax:  
  ```java
  enum EnumName { CONSTANT1, CONSTANT2, ... }
  ```

### ✅ Example:
```java
enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
Day workday = Day.WEDNESDAY;
```

---

## 🔶 Enum Characteristics

- `enum` types are **implicitly final** – you can't extend them.
- `enum` constants are **implicitly static**.
- You **cannot create enum objects** using `new`.

```java
Day workday = Day.THURSDAY;  // Valid
// Day newDay = new Day();  // ❌ Compilation Error
```

---

## 🔶 Built-in Enum Methods

1. `ordinal()` – Returns the index (starting from 0) of the enum constant.
2. `equals(Object obj)` – Compares two enum constants.
3. `compareTo(Enum obj)` – Compares the ordinal values.

### ✅ Example:
```java
System.out.println("Ordinal: " + workday.ordinal());

Day anotherDay = Day.FRIDAY;
System.out.println(workday.equals(anotherDay) ? "Same day" : "Different day");
System.out.println(workday.compareTo(anotherDay)); // Negative if workday < anotherDay
```

---

## 🔶 Enum with Multiple Fields (Opt 1 & Opt 2)

### ✅ Syntax:
```java
public enum Plane {
  B("Bomber", 800),
  F("Fighter", 1600);

  // Opt 1 - public fields
  public final String type;
  public final int speed;

  private Plane(String t, int s) {
    type = t;
    speed = s;
  }
}
```

OR

```java
public enum Plane {
  B("Bomber", 800),
  F("Fighter", 1600);

  // Opt 2 - private fields with getters
  private final String type;
  private final int speed;

  private Plane(String t, int s) {
    this.type = t;
    this.speed = s;
  }

  public String getType() { return type; }
  public int getSpeed() { return speed; }
}
```

---

## 🔶 Iterate Enum Values

### ✅ Using `values()` method:
```java
for (Plane p : Plane.values()) {
  System.out.println(p + " " + p.getType() + " " + p.getSpeed());
}
```

---

## 🔶 Assign and Compare Enum Constants

### ✅ Example:
```java
Plane f16 = Plane.F;
Plane b52 = Plane.B;
```

### ✅ Custom Method Example:
```java
public int compareSpeed(Plane other) {
  return this.getSpeed() - other.getSpeed();
}
```

---

## 🔶 Packages in Java

### ✅ What is a Package?
- A **package** is a **namespace** that organizes classes and interfaces.

### ✅ Why Use Packages?
1. Avoid naming conflicts
2. Easier distribution of code
3. Class access protection

---

## 🔶 Creating Packages

### ✅ Define a Package:
```java
package mypackage.bentuk;
```

### ✅ File Structure:
```
mypackage/
└── bentuk/
    ├── Bulatan.java
    ├── Segiempat.java
    └── SegiTigaTepat.java
```

---

## 🔶 Using Packages

### ✅ Import Options:
```java
import mypackage.bentuk.Bulatan;        // Import specific class
import mypackage.bentuk.*;              // Import all classes
```

---

## ✅ Full Working Code Example (Combining Enum and Packages)

### 🎯 Structure:
```
mypackage/
└── aircraft/
    └── Plane.java
main/
└── TestPlane.java
```

---

### ✅ `Plane.java` (Enum with fields and method)

```java
// File: mypackage/aircraft/Plane.java
package mypackage.aircraft;

public enum Plane {
  B("Bomber", 600),
  F("Fighter", 1600);

  private final String type;
  private final int speed;

  // Constructor
  private Plane(String type, int speed) {
    this.type = type;
    this.speed = speed;
  }

  // Getter methods
  public String getType() { return type; }
  public int getSpeed() { return speed; }

  // Custom method to compare speed
  public int compareSpeed(Plane other) {
    return this.speed - other.speed;
  }
}
```

---

### ✅ `TestPlane.java` (Main program using the enum)

```java
// File: main/TestPlane.java
import mypackage.aircraft.Plane;

public class TestPlane {
  public static void main(String[] args) {
    // Accessing enum constants
    Plane fighter = Plane.F;
    Plane bomber = Plane.B;

    // Display details using getters
    System.out.println("Fighter: " + fighter.getType() + ", Speed: " + fighter.getSpeed());
    System.out.println("Bomber: " + bomber.getType() + ", Speed: " + bomber.getSpeed());

    // Using built-in methods
    System.out.println("Fighter ordinal: " + fighter.ordinal());
    System.out.println("Same plane? " + fighter.equals(bomber));

    // Compare custom method
    int diff = fighter.compareSpeed(bomber);
    System.out.println("Speed difference: " + diff + " km/h");

    // Iterate enum values
    System.out.println("\nAll Plane Types:");
    for (Plane p : Plane.values()) {
      System.out.println(p + " - " + p.getType() + " - " + p.getSpeed());
    }
  }
}
```

---

## 🔧 Compile & Run Instructions (Windows)

### ✅ Set Classpath
```bash
set CLASSPATH=.;c:\path\to\mypackage;
javac mypackage\aircraft\Plane.java
javac -cp . main\TestPlane.java
java -cp . main.TestPlane
```

---

## 📌 Summary

- `enum` simplifies defining constants and provides built-in methods.
- Enums can hold fields, constructors, and methods.
- Packages help organize Java files, prevent name clashes, and manage access control.
```

