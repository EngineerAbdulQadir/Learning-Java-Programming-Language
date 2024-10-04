# Java Class 13 - StringBuilder in Java

In this class, we will explore the **StringBuilder** class in Java, which is used to manipulate mutable strings. Java's default `String` class creates immutable strings, meaning their content cannot be modified after they are created. In contrast, `StringBuilder` allows us to efficiently change string content without creating new objects.

## Table of Contents
1. [Introduction to StringBuilder](#introduction-to-stringbuilder)
2. [String Immutability in Java](#string-immutability-in-java)
3. [Using StringBuilder for String Manipulation](#using-stringbuilder-for-string-manipulation)
   - [Creating and Modifying Strings](#creating-and-modifying-strings)
   - [Appending Characters](#appending-characters)
   - [Inserting and Deleting Characters](#inserting-and-deleting-characters)
   - [Reversing Strings](#reversing-strings)
4. [Examples and Code Walkthrough](#examples-and-code-walkthrough)
5. [Homework](#homework)
6. [Conclusion](#conclusion)

---

## Introduction to StringBuilder
The `StringBuilder` class is used to create mutable strings, meaning you can change the string's content after it's created without creating new objects. This is especially useful when you need to perform multiple modifications to a string in a loop or method. 

---

## String Immutability in Java
In Java, strings created using the `String` class are immutable. This means once a string is created, it cannot be changed. Any attempt to modify the string will result in the creation of a new string.

Example:
```java
String str = "Hello";
str += " World"; // A new string "Hello World" is created
```

This immutability can be inefficient in scenarios where frequent string modifications are required. That's where `StringBuilder` comes in.

---

## Using StringBuilder for String Manipulation

### Creating and Modifying Strings
To create a `StringBuilder` object, you simply instantiate it like any other object:
```java
StringBuilder sb = new StringBuilder("Tony");
```

### Appending Characters
You can append characters or strings using the `append()` method:
```java
sb.append('e'); // "Tony" becomes "Tonye"
sb.append(" Stark"); // "Tonye" becomes "Tonye Stark"
System.out.println(sb); // Output: "Tonye Stark"
```

### Inserting and Deleting Characters
You can insert and delete characters using `insert()` and `delete()` methods:
```java
sb.insert(2, 'n'); // Inserts 'n' at index 2
System.out.println(sb); // Output: "Tnonye Stark"

sb.delete(2, 4); // Deletes characters from index 2 to 4
System.out.println(sb); // Output: "Tony Stark"
```

### Reversing Strings
You can reverse the string stored in a `StringBuilder` using the `reverse()` method:
```java
StringBuilder sb = new StringBuilder("hello");
sb.reverse();
System.out.println(sb); // Output: "olleh"
```

---

## Examples and Code Walkthrough

Here is a complete code snippet illustrating various `StringBuilder` operations:
```java
public class ThirteenClass {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Tony");

        // Append characters
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb); // Output: "Tonyello"
        
        // Get character at index 0
        System.out.println(sb.charAt(0)); // Output: 'T'

        // Set character at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb); // Output: "Ponyello"

        // Insert a character
        sb.insert(2, 'n');
        System.out.println(sb); // Output: "Pnonyeillo"

        // Delete characters
        sb.delete(2, 4);
        System.out.println(sb); // Output: "Poyello"

        // Reverse the string
        StringBuilder sb2 = new StringBuilder("hello");
        for (int i = 0; i < sb2.length() / 2; i++) {
            int front = i;
            int back = sb2.length() - 1 - i;
            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);
            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);
        }
        System.out.println(sb2); // Output: "olleh"
    }
}
```

---

## Homework
Using `StringBuilder`, solve the following string-related problems:

1. Reverse a string without using the `reverse()` method.
2. Check if a given string is a palindrome (reads the same backward and forward).
3. Write a program to remove duplicate characters from a string using `StringBuilder`.
4. Implement a method to count the occurrences of a particular character in a string using `StringBuilder`.

Practice these problems to become more comfortable with mutable strings and their manipulation in Java.

---

## Conclusion
`StringBuilder` is an efficient tool for working with strings in Java, especially when you need to perform multiple modifications to a string. Unlike the immutable `String` class, `StringBuilder` allows you to append, insert, delete, and reverse string content without creating new objects. Mastering `StringBuilder` will help you optimize your programs, particularly in cases where performance matters, such as processing large strings in loops or recursive algorithms.