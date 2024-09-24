# Java Class 03 - Conditional Statements

In this class, we cover **Conditional Statements** in Java, including the `if`, `else if`, `switch`, and `break` keywords. These concepts allow us to make decisions in our code based on specific conditions. Below is the content of the code we discussed during the class.

## Table of Contents
1. [Conditional Statements](#conditional-statements)
   - [If, Else](#if-else)
   - [Else If](#else-if)
   - [Switch](#switch)
   - [Break](#break)
2. [Homework Problem](#homework-problem)

---

## Conditional Statements

### If, Else
The `if` and `else` statements allow the program to take different paths based on a condition.

#### Example: Checking if a person is an adult
```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Not Adult");
}
```

#### Example: Checking if a number is even or odd
```java
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
if (x % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Else If
The `else if` statement allows for more than two possible paths in the code, by checking multiple conditions in sequence.

#### Example: Comparing two numbers
```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

if (a == b) {
    System.out.println("A is equal to B");
} else if (a > b) {
    System.out.println("A is greater than B");
} else {
    System.out.println("A is lesser than B");
}
```

### Switch
The `switch` statement is a more concise way of writing multiple `else if` statements when comparing a variable to specific values.

#### Example: Printing a greeting based on button input
```java
Scanner sc = new Scanner(System.in);
int button = sc.nextInt();

switch(button) {
    case 1:
        System.out.println("Hello");
        break;
    case 2:
        System.out.println("Namaste");
        break;
    case 3:
        System.out.println("Bonjour");
        break;
    default:
        System.out.println("Invalid Button");
}
```

### Break
The `break` statement is used inside a `switch` block to terminate a case and stop the execution of subsequent cases.

#### Example: Using `break` with the switch statement
In the previous switch example, we used `break` to ensure that once a matching case is executed, the program exits the switch block and doesn't execute the remaining cases.

---

## Homework Problem

### Problem 1: Make a Calculator
Create a calculator that performs the following operations:
1. Addition (`+`)
2. Subtraction (`-`)
3. Multiplication (`*`)
4. Division (`/`)
5. Modulo (`%`)

Take two numbers `a` and `b` from the user, and ask the user to choose an operation from the list above. Based on the chosen operation, calculate and display the result.

### Problem 2: Print the Name of a Month
Ask the user to enter the number of a month (1–12), and print the corresponding month name. For example:
- Input: 1 → Output: "January"
- Input: 2 → Output: "February"

---

## Conclusion
In this class, you learned how to use conditional statements to control the flow of your Java programs. By understanding how to apply `if`, `else if`, `switch`, and `break` statements, you are now able to implement decision-making logic in your code. Keep practicing by completing the homework problems to strengthen your understanding.
