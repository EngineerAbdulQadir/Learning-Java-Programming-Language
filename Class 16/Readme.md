# Java Class 16 - Sorting Algorithms

In this class, we will explore three fundamental **Sorting Algorithms**: **Bubble Sort**, **Selection Sort**, and **Insertion Sort**. These algorithms are essential for organizing data and are frequently used in various computational tasks. We'll dive into how each algorithm works, analyze their time complexity, and understand their applications.

## Table of Contents
1. [Introduction to Sorting](#introduction-to-sorting)
2. [Bubble Sort](#bubble-sort)
3. [Selection Sort](#selection-sort)
4. [Insertion Sort](#insertion-sort)
5. [Time Complexity](#time-complexity)
6. [Conclusion](#conclusion)

---

## Introduction to Sorting

Sorting is a process of arranging elements in a particular order (either ascending or descending). It is one of the most fundamental operations in computer science as it enhances the efficiency of searching algorithms and plays a vital role in various data structures and algorithms.

---

## Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

**Algorithm:**
1. Compare adjacent elements in the array.
2. Swap them if they are in the wrong order.
3. Repeat until the array is sorted.

**Example Code:**
```java
int arr[] = {7, 8, 3, 1, 2};
for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // Swap
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
```

---

## Selection Sort

Selection Sort is another simple sorting algorithm. It divides the array into two parts: the sorted part and the unsorted part. It repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted part and swaps it with the first unsorted element.

**Algorithm:**
1. Find the smallest element in the unsorted array.
2. Swap it with the element at the beginning of the unsorted array.
3. Move the boundary between sorted and unsorted parts of the array.

**Example Code:**
```java
int arr[] = {7, 8, 1, 3, 2};
for (int i = 0; i < arr.length - 1; i++) {
    int smallest = i;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smallest]) {
            smallest = j;
        }
    }
    // Swap
    int temp = arr[smallest];
    arr[smallest] = arr[i];
    arr[i] = temp;
}
```

---

## Insertion Sort

Insertion Sort builds the sorted array one element at a time. It is much more efficient than Bubble Sort or Selection Sort for small data sets. In each iteration, the algorithm removes one element from the input data, finds the correct location within the sorted part of the array, and inserts it.

**Algorithm:**
1. Consider the first element as sorted.
2. Pick the next element and compare it with the sorted elements.
3. Shift all the sorted elements that are greater than the picked element to one position ahead.
4. Insert the picked element in its correct position.

**Example Code:**
```java
int arr[] = {7, 8, 1, 3, 2};
for (int i = 1; i < arr.length; i++) {
    int current = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > current) {
        // Keep swapping
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = current;
}
```

---

## Time Complexity

- **Bubble Sort:** O(n²)
- **Selection Sort:** O(n²)
- **Insertion Sort:** O(n²) (However, it's more efficient than Bubble and Selection sorts for small or nearly sorted data.)

---

## Conclusion

In this class, we covered three essential sorting algorithms: **Bubble Sort**, **Selection Sort**, and **Insertion Sort**. Understanding these algorithms is fundamental for efficient data manipulation in programming. While these algorithms may not be optimal for large datasets, they provide a strong foundation for learning more advanced sorting techniques.