# Java Class 18 - Recursion Part 02

In this class, we continue exploring **Recursion** with more advanced examples. We will cover recursive functions to print numbers in different ranges, compute the sum of natural numbers, and calculate the factorial of a number. This class helps solidify the concept of recursion and how it simplifies solving complex problems by breaking them down into smaller, repeatable tasks.

## Table of Contents
1. [Introduction to Recursion Part 02](#introduction-to-recursion-part-02)
2. [Example 1: Print Numbers from 1 to 5](#example-1-print-numbers-from-1-to-5)
3. [Example 2: Print First n Natural Numbers](#example-2-print-first-n-natural-numbers)
4. [Example 3: Sum of First n Natural Numbers](#example-3-sum-of-first-n-natural-numbers)
5. [Example 4: Factorial of a Number](#example-4-factorial-of-a-number)
6. [Conclusion](#conclusion)

---

## Introduction to Recursion Part 02

In this lesson, we take the concept of recursion further by implementing more complex problems such as printing a range of numbers, summing natural numbers, and calculating the factorial of a number. Each example follows the same structure as previous recursion examples, where a function calls itself to solve smaller subproblems.

---

## Example 1: Print Numbers from 1 to 5

We will use recursion to print numbers in ascending order from 1 to 5.

**Code Example:**
```java
public class Main {
    public static void printNumb(int n) {
        if (n == 6) {  // Base Case
            return;
        }
        System.out.println(n);  // Print current number
        printNumb(n + 1);  // Recursive call with n+1
    }

    public static void main(String[] args) {
        int n = 1;
        printNumb(n);  // Start printing from 1 to 5
    }
}
```

Output:
```
1
2
3
4
5
```

---

## Example 2: Print First n Natural Numbers

This example extends the previous one by printing the first n natural numbers, where n can be any value. For this example, we will print numbers from 1 to 10.

**Code Example:**
```java
public class Main {
    public static void printNumb(int n) {
        if (n == 11) {  // Base Case for n = 10
            return;
        }
        System.out.println(n);  // Print current number
        printNumb(n + 1);  // Recursive call with n+1
    }

    public static void main(String[] args) {
        int n = 1;
        printNumb(n);  // Start printing from 1 to 10
    }
}
```

Output:
```
1
2
3
4
5
6
7
8
9
10
```

---

## Example 3: Sum of First n Natural Numbers

Now, we will implement a recursive function to calculate the sum of the first n natural numbers. In this example, we calculate the sum for `n = 5`.

**Code Example:**
```java
public class Main {
    public static void printSum(int n, int sum) {
        if (n == 0) {  // Base Case
            System.out.println(sum);  // Print the sum when n reaches 0
            return;
        }
        sum += n;  // Add n to the sum
        printSum(n - 1, sum);  // Recursive call with n-1
    }

    public static void main(String[] args) {
        printSum(5, 0);  // Calculate sum of first 5 natural numbers
    }
}
```

Output:
```
15
```

Explanation: The sum of 1 + 2 + 3 + 4 + 5 = 15.

---

## Example 4: Factorial of a Number

Lastly, we will use recursion to calculate the factorial of a number `n`. Factorial is defined as the product of all positive integers from 1 to `n`. In this case, we compute `5!` (5 factorial).

**Code Example:**
```java
public class Main {
    public static void printFactorial(int n, int fact) {
        if (n == 0) {  // Base Case for n = 0
            System.out.println(fact);  // Print the factorial result
            return;
        }
        fact *= n;  // Multiply current n with factorial
        printFactorial(n - 1, fact);  // Recursive call with n-1
    }

    public static void main(String[] args) {
        printFactorial(5, 1);  // Calculate factorial of 5
    }
}
```

Output:
```
120
```

Explanation: The factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120.

---

## Conclusion

In this class, we explored more advanced examples of recursion, including printing numbers, summing natural numbers, and calculating factorials. These examples highlight the power of recursion in solving problems by breaking them into smaller subproblems and elegantly reducing repetitive tasks into concise code.