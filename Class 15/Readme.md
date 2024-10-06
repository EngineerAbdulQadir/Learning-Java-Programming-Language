# Java Class 15 - Bit Manipulation

In this class, we will explore **Bit Manipulation** in Java. Bit manipulation refers to the act of algorithmically manipulating bits or binary digits, which is a powerful technique for optimizing memory usage and performance in programming.

## Table of Contents
1. [Introduction to Bit Manipulation](#introduction-to-bit-manipulation)
2. [Bit Operations](#bit-operations)
   - [Get Bit](#get-bit)
   - [Set Bit](#set-bit)
   - [Clear Bit](#clear-bit)
   - [Update Bit](#update-bit)
3. [Practical Applications](#practical-applications)
4. [Homework](#homework)
5. [Conclusion](#conclusion)

---

## Introduction to Bit Manipulation

Bit manipulation allows for efficient low-level processing of data by working directly with binary representations of numbers. Each bit represents a power of 2, and bit manipulation techniques can be used for a wide range of tasks such as setting, toggling, and clearing bits.

---

## Bit Operations

### Get Bit
The **Get Bit** operation is used to check if a specific bit is set (1) or not set (0) at a given position.

```java
int n = 5; // 0101 in binary
int pos = 2;
int bitMask = 1 << pos;

if ((bitMask & n) == 0) {
    System.out.println("Bit was zero");
} else {
    System.out.println("Bit was one");
}
```

### Set Bit
The **Set Bit** operation is used to set a specific bit to 1 at a given position.

```java
int n = 5; // 0101 in binary
int pos = 1;
int bitMask = 1 << pos;

int newNumber = bitMask | n;
System.out.println(newNumber); // Output: 7 (0111 in binary)
```

### Clear Bit
The **Clear Bit** operation is used to clear (set to 0) a specific bit at a given position.

```java
int n = 5; // 0101 in binary
int pos = 2;
int bitMask = 1 << pos;

int newBitMask = ~(bitMask);
int newNumber = newBitMask & n;
System.out.println(newNumber); // Output: 1 (0001 in binary)
```

### Update Bit
The **Update Bit** operation allows you to update a bit at a given position, either setting it to 1 or clearing it to 0 based on a provided operation.

```java
Scanner sc = new Scanner(System.in);
int oper = sc.nextInt(); // oper = 1 to set, oper = 0 to clear
int n = 5;
int pos = 1;
int bitMask = 1 << pos;

if (oper == 1) {
    // Set bit
    int newNumber = bitMask | n;
    System.out.println(newNumber);
} else {
    // Clear bit
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & n;
    System.out.println(newNumber);
}
```

---

## Practical Applications

Bit manipulation techniques are frequently used in scenarios where efficiency is critical, including:
- Checking for odd or even numbers
- Swapping values without a temporary variable
- Counting set bits (1s) in a number
- Performing arithmetic faster than traditional methods
- Compressing data for memory optimization

---

## Homework
1. Write a program to find if a number is a power of 2 or not.
2. Write a program to toggle a bit at a position `pos` in a number `n`.
3. Write a program to count the number of 1s in the binary representation of a number.
4. Write two functions: `decimalToBinary()` and `binaryToDecimal()` to convert a number from one number system to another. **[BONUS]**

---

## Conclusion
In this class, we learned how to manipulate bits using basic operations such as getting, setting, clearing, and updating bits. Mastering bit manipulation helps optimize both memory usage and performance in Java applications, especially in scenarios involving large datasets or complex algorithms.