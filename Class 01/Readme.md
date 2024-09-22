# Class 01 - Introduction to Java Programming

## Topics Covered:
1. **Binary in Programming**: Understanding how binary (0s and 1s) is the fundamental language of computers.
2. **Decimal to Binary Conversion**: Basic examples of converting decimal numbers into binary.
3. **High-Level Language (Java)**: Explanation of how Java works as a high-level programming language.
4. **Java Code Conversion**: Understanding how Java source code is compiled and executed using the Java compiler and JVM.
5. **Installing JDK and VS Code**: Step-by-step instructions for setting up your development environment.
6. **First Java Code**: Writing and running your first "Hello World" Java program.
7. **Functions and Classes in Java**: An introduction to how functions (methods) and classes work in Java.

---

**Binary in Programming (Definition)**:  
Binary is a base-2 number system used by computers to represent all data and instructions, consisting of only 0s and 1s.

**Decimal to Binary Table**:
```
Decimal | Binary
   0    |    0
   1    |    1
   3    |   11
   4    |  100
```

Computers understand keywords and special characters by converting them into binary.

**High-Level Language (Java)**:  
Java is the high-level programming language used in this course. Java code is written by humans and converted into binary using a compiler so the computer can understand and execute it.

### Java Code Conversion:
1. **Java Code** is written in `.java` files.
2. **Compiler (javac)** converts Java source code to bytecode (binary format).
3. **JVM (Java Virtual Machine)** interprets the bytecode and runs it on the computer.

### Installation Process for JDK and VS Code (in `.md` format):
```markdown
# JDK and VS Code Installation Guide

## Installing JDK:
1. Go to the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Download the JDK suitable for your OS (Windows/Linux/Mac).
3. Follow the instructions to install the JDK.
4. After installation, verify JDK installation by typing `java -version` in your command prompt or terminal.

## Installing VS Code:
1. Go to the [VS Code download page](https://code.visualstudio.com/Download).
2. Download the appropriate version for your operating system.
3. Install VS Code by following the installation instructions.
4. Install the **Java Extension Pack** from VS Code to enable Java support.

## Running Your First Java Program:
1. Open VS Code.
2. Create a new folder for your Java project.
3. Inside that folder, create a file called `FirstClass.java`.
4. Copy and paste the following code into the file:
   ```java
   class FirstClass {
       public static void main(String args[]) {
           System.out.println("Hello World");
       }
   }
   ```
5. Save the file.
6. Open the terminal in VS Code, navigate to the folder, and type `javac FirstClass.java` to compile.
7. Run the program using `java FirstClass`.

You're all set!
```

### First Java Code Example:
```java
class FirstClass {
    public static void main (String args[]) {
        System.out.println("Hello World");
    }
}
```

- **File extension**: Save the file with the same name as the class and the extension `.java` (e.g., `FirstClass.java`).

### Functions and Classes in Java:

**Function (method)**:  
A function contains a set of statements to perform specific tasks and is used to execute code.
```java
void main () {
    // Code goes here
}
```

**Class**:  
A class is a blueprint for creating objects and stores functions (methods) inside it.
```java
class Main {
    void main() {
        // Code goes here
    }
}
```

In Java, **functions** are used to run the code, and **classes** are used to store functions.

---

### Conclusion:
In this guide, we covered the basics of binary and its use in programming, particularly in Java. We explained how binary is the language computers understand, introduced the concept of high-level languages like Java, and demonstrated how Java code is compiled and executed. Additionally, we provided instructions for installing the JDK and VS Code, followed by writing and running your first Java program. Understanding how functions (methods) and classes work in Java sets the foundation for developing more complex applications in this versatile and widely-used programming language.