# Java Class 19 - Recursion Part 03

In this class, we continue exploring advanced recursion concepts with a focus on more sophisticated problems, such as the Fibonacci sequence, calculating powers of a number, and optimizing recursion with logarithmic stack height. By understanding these patterns, you'll be able to tackle problems that involve recursive solutions more efficiently.

## Table of Contents
1. [Introduction to Advanced Recursion](#introduction-to-advanced-recursion)
2. [Fibonacci Sequence with Recursion](#fibonacci-sequence-with-recursion)
3. [Power Calculation using Recursion](#power-calculation-using-recursion)
4. [Optimizing Recursion: Logarithmic Stack Height](#optimizing-recursion-logarithmic-stack-height)
5. [Code Examples](#code-examples)
6. [Conclusion](#conclusion)

---

## Introduction to Advanced Recursion

Recursion can be applied to solve complex problems, but the efficiency of the solution depends on how the recursion is structured. In this class, we look at recursion in problems such as the Fibonacci sequence and power calculation, and we'll learn how to optimize recursion to reduce the number of recursive calls, minimizing the stack height.

---

## Fibonacci Sequence with Recursion

The Fibonacci sequence is a classic recursive problem where each number is the sum of the two preceding ones. The sequence starts from 0 and 1. Mathematically, the Fibonacci sequence is defined as:

- **Fib(0) = 0**
- **Fib(1) = 1**
- **Fib(n) = Fib(n-1) + Fib(n-2)** for n ≥ 2

While recursion makes the implementation of Fibonacci straightforward, it can be inefficient with larger values of `n` due to the repeated calculations. Thus, memoization or iterative solutions can be applied for optimization in real-world scenarios.

---

## Power Calculation using Recursion

### Problem: Calculate `x^n`
In this problem, we need to calculate `x` raised to the power `n` using recursion. There are two approaches to solving this problem recursively:

1. **Naive Recursive Approach (Stack height = n)**:
    - Recursively multiply `x` with itself `n` times.
    - Stack height equals `n`, making this solution inefficient for large values of `n`.

2. **Optimized Recursive Approach (Stack height = log(n))**:
    - Use the property that if `n` is even, we can calculate `x^n` as `(x^(n/2)) * (x^(n/2))`, reducing the stack height to `log(n)`.

---

## Optimizing Recursion: Logarithmic Stack Height

One of the major downsides of recursion is that it can consume a lot of memory due to the stack size, especially when the problem size is large. To mitigate this issue, recursive algorithms can be optimized to reduce the number of function calls and thus reduce the stack height.

For example, when calculating powers (i.e., `x^n`), we can optimize the recursion by utilizing the following approach:
- **If `n` is even**, we can compute `x^n` as `x^(n/2) * x^(n/2)`.
- **If `n` is odd**, we compute `x^n` as `x * x^(n/2) * x^(n/2)`.

This reduces the stack height from `n` to `log(n)`, making it much more efficient.

---

## Code Examples

### Example 1: Fibonacci Sequence (Recursive)
This example prints the first `n` Fibonacci numbers using recursion.

```java
public class Main {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) { // Base case
            return;
        }
        System.out.println(a);
        printFibonacci(b, a + b, n - 1); // Recursive call
    }

    public static void main(String args[]) {
        // Q6. Print the Fibonacci sequence till nth term
        printFibonacci(0, 1, 10); // Prints first 10 Fibonacci numbers
    }
}
```

**Output:**
```
0
1
1
2
3
5
8
13
21
34
```

### Example 2: Power Calculation (Recursive with Stack Height = n)
This example calculates `x^n` using recursion with a stack height of `n`.

```java
public class Main {
    public static int printPower(int x, int n) {
        if (n == 0) { // Base case
            return 1;
        }
        if (x == 0) { // If base is 0
            return 0;
        }
        int x_ = printPower(x, n - 1); // Recursive call
        int xn = x * x_;
        return xn;
    }

    public static void main(String args[]) {
        // Q7. Print x^n (with stack height = n)
        int x = 2, n = 5;
        int output = printPower(x, n); // Calculates 2^5
        System.out.println(output); // Output: 32
    }
}
```

**Output:**
```
32
```

### Example 3: Power Calculation (Optimized with Stack Height = log(n))
This example optimizes the power calculation by reducing the stack height to `log(n)`.

```java
public class Main {
    public static int printPower(int x, int n) {
        if (n == 0) { // Base case
            return 1;
        }
        if (n % 2 == 0) { // If n is even
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else { // If n is odd
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String args[]) {
        // Q8. Print x^n (with stack height = log(n))
        int x = 2, n = 5;
        int output = printPower(x, n); // Calculates 2^5
        System.out.println(output); // Output: 32
    }
}
```

**Output:**
```
32
```

---

## Conclusion

In this class, we've covered advanced recursion topics such as calculating Fibonacci sequences and powers of a number, and how to optimize recursion to minimize the stack height. Understanding how to reduce recursive stack depth is essential for solving more complex problems efficiently without consuming too much memory.