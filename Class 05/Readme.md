# Java Class 05 - Patterns

In this class, we focus on **Patterns** in Java. Pattern problems are a common exercise in programming that help us understand loops better. By drawing various patterns using loops, we can enhance our logical thinking and get comfortable with nested loops.

We discussed different types of patterns such as solid rectangles, hollow rectangles, pyramids, inverted pyramids, and more. Below is a summary of the content covered in this class along with the relevant Java code.

## Table of Contents
1. [Patterns](#patterns)
   - [Solid Rectangle](#solid-rectangle)
   - [Hollow Rectangle](#hollow-rectangle)
   - [Half Pyramid](#half-pyramid)
   - [Inverted Half Pyramid](#inverted-half-pyramid)
   - [Rotated Inverted Half Pyramid](#rotated-inverted-half-pyramid)
   - [Half Pyramid with Numbers](#half-pyramid-with-numbers)
   - [Inverted Half Pyramid with Numbers](#inverted-half-pyramid-with-numbers)
   - [Floyd's Triangle](#floyds-triangle)
   - [0-1 Triangle](#0-1-triangle)
2. [Homework Problems](#homework-problems)

---

## Patterns

### Solid Rectangle
The solid rectangle is one of the most basic patterns. It consists of `n` rows and `m` columns, and every cell is filled with asterisks (`*`).

#### Example: Printing a solid rectangle of size 4x5
```java
int n = 4;
int m = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= m; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Hollow Rectangle
A hollow rectangle consists of asterisks (`*`) on the border, while the inner cells are empty.

#### Example: Printing a hollow rectangle of size 4x5
```java
int n = 4;
int m = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= m; j++) {
        if(i == 1 || i == n || j == 1 || j == m) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

### Half Pyramid
The half pyramid is a triangular pattern where the number of asterisks increases with each row.

#### Example: Printing a half pyramid of height 4
```java
int n = 4;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Inverted Half Pyramid
An inverted half pyramid has decreasing rows of asterisks.

#### Example: Printing an inverted half pyramid of height 4
```java
int n = 4;
for(int i = n; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Rotated Inverted Half Pyramid
In a rotated inverted half pyramid, the stars start at the rightmost position.

#### Example: Printing a rotated inverted half pyramid of height 4
```java
int n = 4;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n-i; j++) {
        System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Half Pyramid with Numbers
In this pattern, the numbers increase with each row.

#### Example: Printing a half pyramid of numbers of height 5
```java
int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

### Inverted Half Pyramid with Numbers
Here, the numbers decrease with each row.

#### Example: Printing an inverted half pyramid of numbers of height 5
```java
int n = 5;
for(int i = n; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

### Floyd's Triangle
Floyd’s triangle is a right-angled triangular array of natural numbers.

#### Example: Printing Floyd’s triangle with 5 rows
```java
int n = 5;
int number = 1;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
    }
    System.out.println();
}
```

### 0-1 Triangle
In this pattern, alternating 1’s and 0’s are printed in a triangular form.

#### Example: Printing a 0-1 triangle of height 5
```java
int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        int sum = i + j;
        if(sum % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }
    System.out.println();
}
```

---

## Homework Problems (Solutions in next Lecture’s Video)

### Problem 1: Print a Solid Rhombus
Write a program to print a solid rhombus.

---

### Problem 2: Print a Number Pyramid
Write a program to print a number pyramid.

---

### Problem 3: Print a Palindromic Number Pyramid
Write a program to print a palindromic number pyramid.

--- 

## Conclusion
In this class, you learned how to print various patterns using loops. These patterns, though simple, help in mastering the use of nested loops and logical thinking.