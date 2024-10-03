# Java Class 09 - Time and Space Complexity

In this class, we will dive into the analysis of algorithms in terms of **time and space complexity**. Understanding these concepts is crucial for evaluating the efficiency of your code, especially when dealing with large inputs. You will learn about different notations to measure the performance of algorithms and how to compare them based on complexity.

## Table of Contents
1. [Introduction to Time Complexity](#introduction-to-time-complexity)
2. [Notations for Time Complexity](#notations-for-time-complexity)
   - [Big-O Notation (O)](#big-o-notation-o)
   - [Big-Omega Notation (Ω)](#big-omega-notation-Ω)
   - [Theta Notation (𝚯)](#theta-notation-𝚯)
3. [Examples of Time Complexity](#examples-of-time-complexity)
4. [Comparison of Functions Based on Time Complexity](#comparison-of-functions-based-on-time-complexity)
5. [Space Complexity](#space-complexity)

---

## Introduction to Time Complexity
**Time complexity** of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input. The goal is to express the algorithm's running time in terms of input size, which allows us to estimate how efficient or inefficient an algorithm is.

---

## Notations for Time Complexity

### Big-O Notation (O)
- **Definition**: Big-O notation represents the **upper bound** of an algorithm’s running time. It gives us an idea of the **worst-case** scenario for the algorithm.
- **Example**: If an algorithm has a time complexity of O(n), it means that in the worst case, the time taken grows linearly with the input size `n`.

### Big-Omega Notation (Ω)
- **Definition**: Big-Omega notation represents the **lower bound** of an algorithm’s running time. It provides an idea of the **best-case** scenario.
- **Example**: If an algorithm has a time complexity of Ω(n), it means that at least in the best case, the time taken grows linearly with the input size `n`.

### Theta Notation (𝚯)
- **Definition**: Theta notation denotes the **average time complexity** of a program, meaning it represents both the upper and lower bounds.
- **Example**: If an algorithm has a time complexity of 𝚯(n), it takes linear time both in the worst-case and best-case scenarios.

---

## Examples of Time Complexity

1. **Constant Time - O(1)**: Algorithms that run in constant time, regardless of the size of the input.
   - Example: Accessing an element in an array.

2. **Linear Time - O(n)**: Algorithms that grow linearly with the size of the input.
   - Example: A loop that iterates over an array of size `n`.

3. **Quadratic Time - O(n²)**: Algorithms that grow quadratically with input size.
   - Example: A nested loop that iterates over an array of size `n`.

4. **Exponential Time - O(2ⁿ)**: Algorithms that double their running time with every additional input element.
   - Example: Recursive algorithms that solve subproblems repeatedly.

---

## Comparison of Functions Based on Time Complexity

Here’s the order of common time complexity functions from **highest to lowest** (worst to best performance):

- **O(nⁿ)**
- **O(n!)**
- **O(n³)**
- **O(n²)**
- **O(n log n)**
- **O(n log log n)**
- **O(n)**
- **O(√n)**
- **O(log n)**
- **O(1)**

**Note**: The smaller the time complexity, the faster and more efficient the algorithm is.

---

## Space Complexity
**Space complexity** measures the amount of memory required by an algorithm as a function of the input size. It is directly proportional to the largest memory consumed by the program at any point during runtime.

For example:
- An `int` in Java consumes 4 bytes of memory.
  
If your algorithm uses a large array or performs recursion, the space complexity increases.

---

## Conclusion

This class is focused on understanding how to measure the efficiency of your algorithms using time and space complexity. Knowing how to analyze the performance of your programs is key to writing scalable, efficient code that handles large inputs effectively.