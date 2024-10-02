# Java Class 06 - Advanced Patterns and Number Series

In this class, we dive deeper into **Advanced Patterns** and **Number Series** in Java. This session enhances your understanding of loops and conditions by introducing more complex pattern problems and number series. These exercises will strengthen your logic-building and problem-solving skills.

## Table of Contents
1. [Patterns](#patterns)
   - [Hollow Butterfly](#hollow-butterfly)
   - [Hollow Rhombus](#hollow-rhombus)
   - [Pascal’s Triangle](#pascals-triangle)
   - [Half Pyramid](#half-pyramid)
   - [Inverted Half Pyramid](#inverted-half-pyramid)
2. [Homework Problems](#homework-problems)

---

## Patterns

### Hollow Butterfly
The hollow butterfly pattern consists of two hollow triangles facing each other with spaces in the middle.

#### Example: Printing a hollow butterfly of height 5
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

### Hollow Rhombus
The hollow rhombus pattern is a skewed rectangle with hollow interiors and stars (`*`) along its borders.

#### Example: Printing a hollow rhombus of size 5
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

### Pascal’s Triangle
Pascal's Triangle is a triangular array of numbers, where each number is the sum of the two numbers directly above it.

#### Example: Printing Pascal’s triangle for `n` rows
```java
int n = 5;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
    }
    int number = 1;
    for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        number = number * (i - j) / (j + 1);
    }
    System.out.println();
}
```

### Half Pyramid with Numbers
This pattern prints a half pyramid with numbers, where the numbers increment in each row.

#### Example: Printing a half pyramid of numbers of height 5
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

### Inverted Half Pyramid with Numbers
This is an inverted version of the half pyramid where numbers decrease in rows.

#### Example: Printing an inverted half pyramid of numbers
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j < i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= (n - i + 1); j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

---

## Homework Problems

### Problem 1: Print a Hollow Diamond
Write a program to print a hollow diamond pattern.

---

### Problem 2: Print a Zigzag Pattern
Write a program to print a zigzag pattern.

---

### Problem 3: Print a Star Pyramid
Write a program to print a pyramid with stars.

---

### Problem 4: Print an X-pattern with Stars
Write a program to print an X-pattern using stars (`*`).

---

## Conclusion
In this class, we extended our knowledge of patterns by introducing more complex patterns such as the hollow butterfly, hollow rhombus, Pascal’s triangle, and various types of pyramids. These exercises are crucial for mastering loops, conditionals, and nested loops in Java.
