# Class 02 - Java Programming Basics

In this class, we explored some foundational concepts of Java programming, including output, variables, data types, and user input. Below is a breakdown of the topics covered, with examples provided in the code.

---

## Table of Contents:
1. [Boilerplate Code](#boilerplate-code)
2. [Output](#output)
3. [Variables](#variables)
4. [Data Types](#data-types)
5. [Input](#input)

---

## Boilerplate Code
In Java, every program needs a class and a `main()` method where the program execution begins. Here's an example of basic boilerplate code:

```java
public class SecondClass {
    public static void main (String args[]) {
        // Your code goes here
    }
}
```
- `class`: Defines a class named `SecondClass`.
- `main(String args[])`: This is the entry point where the Java program starts executing.

---

## Output
Java provides different methods to print output to the console.

```java
// Standard Output
System.out.print("Output"); // Prints without a new line
System.out.println("New Line"); // Prints and moves to a new line
System.out.print("New Line\n"); // Prints and manually moves to a new line using \n
```

**Practice Question:**
Print the following pattern:
```
*
**
***
****
```
Solution:
```java
System.out.println("*");
System.out.println("**");
System.out.println("***");
System.out.println("****");
```

---

## Variables
Variables are used to store data values in a program. You can define variables with a specific data type and assign them a value.

### Example:
```java
// Defining Variables
String name = "Abdul Qadir Imran";
int a = 10;
int b = 20;
double price = 30.1;

// Modifying variables
b = 25;
name = "Abdul Qadir";

// Outputting Variable Values
System.out.println(name);
System.out.println(a);
System.out.println(b);
System.out.println(price);
```

---

## Data Types
Java has **primitive** and **non-primitive** data types. Here we focus on primitive data types:

### Primitive Data Types:
- **byte**: 8 bits
- **char**: 2 bytes
- **boolean**: 1 byte
- **int**: 4 bytes
- **long**: 8 bytes
- **float**: 4 bytes
- **double**: 8 bytes

### Example of Using Data Types:
```java
int a = 10;
int b = 20;
int sum = a + b;
System.out.println(sum); // Outputs the sum of a and b
```

---

## Input
To take input from the user, Java uses the `Scanner` class from the `java.util` package.

### Example:
1. **For One Word Input:**
   ```java
   Scanner sc = new Scanner(System.in);
   String name = sc.next(); // Takes one word input
   System.out.println(name);
   ```

2. **For Full Line Input:**
   ```java
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine(); // Takes full line input
   System.out.println(name);
   ```

3. **For Integer Input:**
   ```java
   int a = sc.nextInt(); // Takes integer input
   int b = sc.nextInt();
   int sum = a + b;
   System.out.println(sum); // Outputs the sum of a and b
   ```

---

### Conclusion
In Class 02, we learned how to write basic Java programs, including printing output, defining and modifying variables, working with different data types, and taking user input. Each of these concepts forms the foundation for building more complex programs in Java.

