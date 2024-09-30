# Java Class 04 - Loops

In this class, we focus on **Loops** in Java, which allow us to execute a block of code multiple times. We cover three types of loops: `for`, `while`, and `do-while`. Each of these loops can be used to control repeated execution based on a condition. Below is the content of the code we discussed during the class.

## Table of Contents
1. [Loops](#loops)
   - [For Loop](#for-loop)
   - [While Loop](#while-loop)
   - [Do-While Loop](#do-while-loop)
2. [Practice Problems](#practice-problems)
3. [Homework Problems](#homework-problems)

---

## Loops

### For Loop
The `for` loop is used when the number of iterations is known beforehand. It consists of three parts: initialization, condition, and increment/decrement.

#### Example: Printing "Hello World" 100 times
```java
for(int counter = 0; counter < 100; counter++) {
    System.out.println("Hello World");
}
```

#### Practice: Printing numbers from 0 to 10
```java
for (int counter = 0; counter <= 10; counter++) {
    System.out.println(counter);
}
```

### While Loop
The `while` loop keeps executing as long as the specified condition is `true`. It is useful when the number of iterations is not known ahead of time.

#### Example: Printing numbers from 0 to 10
```java
int i = 0;
while(i <= 10) {
    System.out.println(i);
    i++;  // increment
}
```

### Do-While Loop
The `do-while` loop is similar to the `while` loop, but it guarantees that the block of code is executed at least once, even if the condition is false.

#### Example: Printing numbers from 1 to 10
```java
int i = 1;
do {
    System.out.println(i);
    i++;  // increment
} while(i <= 10);
```

#### True/False Concept with Loops
In the `while` and `do-while` loops, conditions can evaluate to `true` or `false`. The loop continues executing as long as the condition is `true`.

Example: Demonstrating the difference between `while` and `do-while`
```java
int i = 12;

while (i < 11) {
    System.out.println("GloProg");  // Will not execute
}

do {
    System.out.println("GloProg");  // Will execute once
} while (i < 11);
```

---

## Practice Problems

### Problem 1: Sum of First N Natural Numbers
Write a program that takes an integer `n` from the user and prints the sum of the first `n` natural numbers.
```java
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
int sum = 0;
for (int i = 0; i <= n; i++) {
    sum += i;
}
System.out.println(sum);
```

### Problem 2: Multiplication Table
Write a program that takes an integer `n` from the user and prints its multiplication table.
```java
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
for (int i = 1; i <= 10; i++) {
    System.out.println(n + " * " + i + " = " + (n * i));
}
```

---

## Homework Problems

### Problem 1: Print All Even Numbers Till n
Write a program that takes an integer `n` from the user and prints all even numbers from 0 to `n`.
```java
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();
for (int i = 0; i <= n; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}
```

### Problem 2: Analyze an Infinite Loop
Run the following code on your system and analyze what happens:
```java
for(;;) {
    System.out.println("Apna College");
}
```
Think about why this loop never stops and try to understand the reason for the infinite output.

### Problem 3: Menu-Driven Program
Create a menu-driven program where the user enters either `1` or `0`. If the user enters `1`, continue taking input for a student’s marks (out of 100). If they enter `0`, stop the input. Based on the student's marks, print messages according to the following rules:
- Marks >= 90 → print "This is Good"
- 89 >= Marks >= 60 → print "This is also Good"
- 59 >= Marks >= 0 → print "This is Good as well"

**Hint:** Use a `do-while` loop, and think about why this structure is appropriate for the problem.
```java
Scanner sc = new Scanner(System.in);
int input;
do {
    System.out.println("Enter 1 to input marks or 0 to stop:");
    input = sc.nextInt();
    if (input == 1) {
        System.out.println("Enter marks (out of 100):");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("This is Good");
        } else if (marks >= 60) {
            System.out.println("This is also Good");
        } else {
            System.out.println("This is Good as well");
        }
    }
} while (input != 0);
```

### Bonus Question: Prime Number Checker
Write a program that checks if a number `n` is prime or not. (A prime number is only divisible by 1 and itself.)
```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean isPrime = true;

if (n <= 1) {
    isPrime = false;
} else {
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
}

if (isPrime) {
    System.out.println(n + " is a prime number.");
} else {
    System.out.println(n + " is not a prime number.");
}
```

---

## Conclusion
In this class, you learned about loops in Java, including the `for`, `while`, and `do-while` loops. These concepts are essential for writing code that requires repeated execution. The homework problems will help you explore different use cases of loops, including controlling infinite loops, creating menu-driven programs, and working with prime numbers.