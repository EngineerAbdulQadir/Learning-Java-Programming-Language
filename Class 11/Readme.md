# Java Class 11 - 2D Arrays and Matrix Operations

In this class, we will explore **2D arrays** in Java, focusing on how to input, process, and manipulate data stored in matrix form. You'll learn the basics of working with 2D arrays, how to search within them, and some advanced matrix operations like finding the transpose and printing matrices in spiral order.

## Table of Contents
1. [Introduction to 2D Arrays](#introduction-to-2d-arrays)
2. [Working with 2D Arrays](#working-with-2d-arrays)
   - [Declaring and Initializing 2D Arrays](#declaring-and-initializing-2d-arrays)
   - [Inputting Values into 2D Arrays](#inputting-values-into-2d-arrays)
   - [Printing 2D Arrays](#printing-2d-arrays)
3. [Practice Problem: Search in 2D Array](#practice-problem-search-in-2d-array)
4. [Advanced Topics](#advanced-topics)
   - [Spiral Order Matrix](#spiral-order-matrix)
   - [Transpose of a Matrix](#transpose-of-a-matrix)
5. [Homework Problems](#homework-problems)

---

## Introduction to 2D Arrays
A **2D array** is an array of arrays, where data is stored in a tabular form with rows and columns. This is especially useful when dealing with matrix-related problems or grid-based data structures in Java.

---

## Working with 2D Arrays

### Declaring and Initializing 2D Arrays
To declare a 2D array in Java:
```java
int[][] array = new int[rows][columns];
```
This creates a 2D array with the given number of rows and columns.

### Inputting Values into 2D Arrays
You can use nested loops to input values into a 2D array:
```java
Scanner sc = new Scanner(System.in);
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
        array[i][j] = sc.nextInt();
    }
}
```

### Printing 2D Arrays
To print the 2D array, use a similar nested loop:
```java
for (int i = 0; i < rows; i++) {
    for (int j = j = 0; j < columns; j++) {
        System.out.print(array[i][j] + " ");
    }
    System.out.println(); // Move to the next row
}
```

---

## Practice Problem: Search in 2D Array
### Problem Statement:
Given a 2D array, search for a specific element `x` and print the indices where it occurs. If the element is not found, print a message indicating that.

### Sample Code:
```java
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int cols = sc.nextInt();
int[][] array = new int[rows][cols];

// Input values into the 2D array
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        array[i][j] = sc.nextInt();
    }
}

// Search for element x
int x = sc.nextInt();
boolean found = false;

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        if (array[i][j] == x) {
            System.out.println("X Found At Location (" + i + "," + j + ")");
            found = true;
        }
    }
}

if (!found) {
    System.out.println("Element not found");
}
```

---

## Advanced Topics

### Spiral Order Matrix
This is a more complex problem where you are asked to print the elements of a matrix in **spiral order** (starting from the top-left corner and spiraling inwards).

---

### Transpose of a Matrix
The **transpose** of a matrix is an operation where the rows and columns of a matrix are swapped.

---

## Homework Problems
1. **Spiral Order Matrix**: Print the spiral order of a given matrix.
2. **Transpose of a Matrix**: For a matrix `N x M`, print its transpose.

---

## Conclusion

In this class, we learned the basics of working with **2D arrays** in Java, including how to input and output matrix values, how to search within a matrix, and more advanced operations like finding the transpose or printing matrices in spiral order. Mastering 2D arrays will help you tackle more complex data structure problems in future classes.