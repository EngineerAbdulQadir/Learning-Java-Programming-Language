# Java Class 10 - Introduction to Arrays and Linear Search

In this class, we will explore the concept of **arrays**, one of the most commonly used data structures in programming. You will learn how to define arrays, input data into arrays, and implement **linear search** to find elements within an array. Additionally, you will be introduced to several practice problems that reinforce these concepts.

## Table of Contents
1. [Introduction to Arrays](#introduction-to-arrays)
2. [Defining Arrays](#defining-arrays)
   - [Type 1: Specifying Size](#type-1-specifying-size)
   - [Type 2: Initializing with Values](#type-2-initializing-with-values)
3. [Working with Arrays](#working-with-arrays)
   - [Array Input and Output](#array-input-and-output)
4. [Linear Search Algorithm](#linear-search-algorithm)
5. [Homework Problems](#homework-problems)

---

## Introduction to Arrays
An **array** is a collection of items stored at contiguous memory locations. It is a way to store multiple values of the same type. Arrays make it easier to work with large datasets and manipulate the elements using loops.

---

## Defining Arrays

### Type 1: Specifying Size
You can define an array by specifying the size (number of elements):
```java
int[] marks = new int[3]; // Defining an Array with Size 3
```

### Type 2: Initializing with Values
Alternatively, you can define and initialize an array with specific values:
```java
int[] marks = {95, 97, 98}; // Defining an Array with Values
```

In both cases, each element of the array can be accessed using an **index**, where the first element is at index `0`.

---

## Working with Arrays

### Array Input and Output
We can use loops to handle input and output with arrays.

#### Example of Taking Input:
```java
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();  // Specify the size of the array
int[] numbers = new int[size];

// Input elements into the array
for (int i = 0; i < size; i++) {
    numbers[i] = sc.nextInt();
}
```

#### Example of Output:
```java
for (int i = 0; i < size; i++) {
    System.out.println(numbers[i]);  // Output the array elements
}
```

---

## Linear Search Algorithm
The **linear search** algorithm checks each element of the array sequentially to find a specific value. If the element is found, it returns the index; otherwise, it indicates that the element is not present.

#### Example of Linear Search:
```java
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();  
int[] numbers = new int[size];

// Input elements into the array
for (int i = 0; i < size; i++) {
    numbers[i] = sc.nextInt();
}

int x = sc.nextInt();  // Element to search for

// Linear search
for (int i = 0; i < size; i++) {
    if (numbers[i] == x) {
        System.out.println("X found at index: " + i);
        break;
    }
}
```

---

## Homework Problems
1. **Array of Names**: Take an array of names as input from the user and print each name on the screen.
   
2. **Maximum and Minimum**: Find the maximum and minimum values in an array of integers. (Hint: Use `Integer.MIN_VALUE` and `Integer.MAX_VALUE`).

3. **Check Sorted Array**: Take an array of numbers as input and check if the array is sorted in ascending order.
   - Example: `{1, 2, 4, 7}` is sorted in ascending order, but `{3, 4, 6, 2}` is not.

---

## Conclusion

This class introduces the fundamental concept of **arrays** in Java and provides a foundation for working with larger datasets. Arrays help in organizing and accessing data efficiently. We also discussed the **linear search** algorithm, which is a basic technique for finding elements in an array. Continue practicing with the homework problems to solidify your understanding.