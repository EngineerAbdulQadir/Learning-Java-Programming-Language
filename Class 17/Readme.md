# Java Class 17 - Recursion Part 01

In this class, we dive into the concept of **Recursion**. Recursion is an important programming technique where a function calls itself in order to solve smaller instances of the same problem. Understanding recursion is critical for solving many complex problems in a clean and efficient way.

## Table of Contents
1. [Introduction to Recursion](#introduction-to-recursion)
2. [Recursion vs Iteration](#recursion-vs-iteration)
3. [Example: Printing Numbers using Recursion](#example-printing-numbers-using-recursion)
4. [Memory Stack in Recursion](#memory-stack-in-recursion)
5. [Conclusion](#conclusion)

---

## Introduction to Recursion

Recursion is a method where the solution to a problem depends on solutions to smaller instances of the same problem. A recursive function is a function that calls itself to work towards a base case, which terminates the recursion.

A recursive function generally has:
1. **Base Case:** The condition where the recursion stops.
2. **Recursive Case:** The part where the function calls itself with modified parameters to work towards the base case.

---

## Recursion vs Iteration

Recursion and iteration (loops) are two ways to solve repetitive problems. While loops repeat the process explicitly, recursion solves the problem by breaking it down into smaller subproblems. Both techniques are useful, but recursion is particularly handy when dealing with problems that can naturally be divided into smaller subproblems, like tree traversal, searching, and sorting.

---

## Example: Printing Numbers using Recursion

We will now see a simple example of recursion by writing a function to print numbers from 5 to 1. 

**Code Example:**

```java
public class Main {
    public static void printNumb(int n) {
        if (n == 0) {
            return;  // Base Case
        }
        System.out.println(n);  // Printing current number
        printNumb(n-1);  // Recursive call with n-1
    }

    public static void main(String[] args) {
        int n = 5; 
        printNumb(n);  // Call the recursive function
    }
}
```

### Explanation:

1. **Base Case:** If `n == 0`, the function stops, preventing infinite recursion.
2. **Recursive Case:** For any `n > 0`, the function prints the number and calls itself with `n-1`.

Output:
```
5
4
3
2
1
```

---

## Memory Stack in Recursion

Each recursive function call is placed on the **call stack**. As the recursion progresses, new frames (representing function calls) are added to the stack. When the base case is reached, the function calls start resolving in reverse order, popping the frames off the stack.

### Memory Behavior:
1. **Recursive Call:** Every time a function calls itself, a new copy of the function’s execution context is created in memory.
2. **Unwinding:** Once the base case is met, the recursion "unwinds," meaning the function calls start completing in reverse order.

In the above example, the call stack builds up with each function call until `n` reaches 0. Then, the stack unwinds and the program terminates.

---

## Conclusion

In this class, we learned the basics of recursion, a powerful tool in problem-solving. We explored how recursion works, saw an example of recursive function calls, and discussed how recursion affects memory using the call stack. Recursion is an elegant solution to many problems, but it is important to ensure the base case is properly defined to avoid infinite loops.