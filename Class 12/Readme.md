# Java Class 12 - Strings in Java

In this class, we will focus on **Strings** in Java, a non-primitive data type widely used in application development. You will learn how to declare, manipulate, and perform operations on strings such as concatenation, comparison, substring extraction, and more. Additionally, the class will introduce problem-solving using strings with homework exercises.

## Table of Contents
1. [Introduction to Strings](#introduction-to-strings)
2. [String Declaration](#string-declaration)
   - [String Declaration with Input](#string-declaration-with-input)
3. [String Operations](#string-operations)
   - [Concatenation](#concatenation)
   - [charAt Method](#charat-method)
   - [Comparing Strings](#comparing-strings)
   - [Substring Extraction](#substring-extraction)
4. [Homework Problems](#homework-problems)

---

## Introduction to Strings
A **String** in Java is an object that represents a sequence of characters. Unlike primitive data types, strings are non-primitive and provide various methods to perform operations like searching, comparing, and transforming.

---

## String Declaration

### Without Input
Strings can be declared directly by assigning a sequence of characters.

```java
String name = "Abdul Qadir";
String fullName = "Abdul Qadir Imran";
String sentence = "My name is Abdul Qadir Imran.";
```

### String Declaration with Input
You can also take string input from the user using the `Scanner` class.

```java
Scanner sc = new Scanner(System.in);
String name = sc.next();        // For one word input
String sentence = sc.nextLine(); // For full sentence input
System.out.println("Your Name Is: " + name);
```

---

## String Operations

### Concatenation
Concatenation means combining two or more strings together.

```java
String firstName = "Abdul";
String lastName = "Qadir";
String fullName = firstName + " " + lastName;
System.out.println(fullName);
System.out.println("Length: " + fullName.length());
```

### charAt Method
The `charAt()` method retrieves the character at a specific index in the string.

```java
for (int i = 0; i < fullName.length(); i++) {
    System.out.println(fullName.charAt(i));
}
```

### Comparing Strings
Strings in Java can be compared using two methods: `compareTo()` and `==`.

1. `compareTo()`:
   - Returns 0 if strings are equal.
   - Returns a positive value if the first string is greater.
   - Returns a negative value if the first string is smaller.

```java
String name1 = "Abdul";
String name2 = "Abdul";

if (name1.compareTo(name2) == 0) {
    System.out.println("Strings Are Equal");
} else {
    System.out.println("Strings Are Not Equal");
}
```

2. `==` operator:
   - Checks whether two strings refer to the same memory location.

```java
if (name1 == name2) {
    System.out.println("Strings Are Equal");
} else {
    System.out.println("Strings Are Not Equal");
}
```

### Substring Extraction
The `substring()` method extracts a portion of a string, starting from a specified index.

```java
String sentence = "My name is Abdul Qadir";
String name = sentence.substring(11, sentence.length());
System.out.println(name); // Output: Abdul Qadir
```

---

## Homework Problems

1. **Cumulative Length of Strings**: Take an array of string inputs from the user and calculate the combined length of all the strings.

2. **Replace 'e' with 'i'**: Input a string from the user, create a new string where every 'e' in the original string is replaced with 'i'.
   - Example:
     - Original: `eabcdef` → Result: `iabcdif`
     - Original: `xyz` → Result: `xyz`

3. **Create Username from Email**: Input an email from the user and create a username by removing everything after the '@' symbol.
   - Example:
     - Email: `abdulqadirimran001@gmail.com` → Username: `abdulqadirimran001`
     - Email: `helloWorld123@gmail.com` → Username: `helloWorld123`

---

## Conclusion

In this class, we covered the fundamentals of strings in Java, including string declaration, concatenation, and comparison. Additionally, you have been provided with problems that will help you practice string manipulation further. Understanding these concepts is vital for mastering Java programming as strings are an integral part of most applications.