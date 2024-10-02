# Java Class 07 - Functions in Java

In this class, we focus on **Functions (Methods)** in Java. You'll learn how to create and use functions to organize your code, make it reusable, and enhance readability. This class will also cover **return types**, **parameters**, **recursion**, and best practices when using functions in Java.

## Table of Contents
1. [Introduction to Functions](#introduction-to-functions)
2. [Creating Functions in Java](#creating-functions-in-java)
3. [Return Types and Parameters](#return-types-and-parameters)
4. [Function Overloading](#function-overloading)
5. [Recursion](#recursion)
6. [Best Practices for Functions](#best-practices-for-functions)
7. [Homework Problems](#homework-problems)

---

## Introduction to Functions

A **function** (also called a method in Java) is a block of code designed to perform a specific task. It improves code organization and helps in reusability by avoiding repeated code. Functions can take inputs, perform computations, and return results.

**Syntax of a function**:
```java
returnType functionName(parameters) {
    // function body
}
```

## Creating Functions in Java

Here's an example of a simple function that prints a message:
```java
void printMessage() {
    System.out.println("Hello, Java learners!");
}
```
In this function:
- `void` is the return type, which means the function doesn't return any value.
- `printMessage` is the function name.

To call this function, simply write:
```java
printMessage();
```

## Return Types and Parameters

Functions can return values and accept parameters to work with data. Here’s an example of a function that adds two numbers and returns the result:
```java
int addNumbers(int a, int b) {
    int sum = a + b;
    return sum;
}
```
- `int` is the return type.
- The function takes two `int` parameters, `a` and `b`, and returns their sum.

To call the function:
```java
int result = addNumbers(5, 10);
System.out.println("Sum: " + result);
```

## Function Overloading

Function overloading allows you to define multiple functions with the same name but different parameters. Java decides which function to call based on the number or type of arguments passed.

Example:
```java
int addNumbers(int a, int b) {
    return a + b;
}

double addNumbers(double a, double b) {
    return a + b;
}
```

Here, both functions have the same name but work with different data types (int and double).

## Recursion

Recursion is a technique where a function calls itself to solve a smaller instance of the problem. It's commonly used to solve problems like factorial calculation or traversing recursive data structures.

**Example: Factorial using recursion**
```java
int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```
This function computes the factorial of a number `n` by repeatedly calling itself with decremented values of `n`.

## Best Practices for Functions

- **Keep functions short and focused**: A function should do one thing and do it well.
- **Use descriptive names**: The function name should describe its purpose.
- **Avoid side effects**: Functions should ideally return results without modifying global state.
- **Limit parameters**: Try to limit the number of parameters a function accepts. If there are too many, consider refactoring.
- **Document your functions**: Comment your code to explain the function’s purpose and any tricky logic.

---

## Homework Problems

### Problem 1: Write a Function to Calculate Power
Create a function that takes two integers, `x` and `y`, and returns the value of `x^y` (x raised to the power of y).

---

### Problem 2: Write a Function to Reverse a String
Write a function that accepts a string and returns the reversed version of it.

---

### Problem 3: Recursive Fibonacci Sequence
Create a function to print the first `n` numbers of the Fibonacci sequence using recursion.

---

### Problem 4: Write a Function to Check if a Number is Prime
Write a function that checks if a given number `n` is prime or not.

---

## Conclusion

In this class, you learned the basics of functions in Java, how to create them, and use return types and parameters. You also explored function overloading and recursion, which are key tools for efficient programming. Applying these concepts will enhance the modularity and clarity of your Java programs.