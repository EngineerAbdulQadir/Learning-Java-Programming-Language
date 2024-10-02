# Java Class 08 - Practice Problems

In this class, we will focus on strengthening your understanding of Java functions by solving various practice problems. These exercises cover different concepts such as loops, conditionals, arithmetic operations, and function implementation. By completing these problems, you will enhance your problem-solving skills and gain more confidence in writing efficient Java programs.

## Table of Contents
1. [Practice Questions](#practice-questions)
   - [Problem 1: Average of Three Numbers](#problem-1-average-of-three-numbers)
   - [Problem 2: Sum of All Odd Numbers](#problem-2-sum-of-all-odd-numbers)
   - [Problem 3: Greater of Two Numbers](#problem-3-greater-of-two-numbers)
   - [Problem 4: Circumference of a Circle](#problem-4-circumference-of-a-circle)
   - [Problem 5: Voting Eligibility](#problem-5-voting-eligibility)
   - [Problem 6: Infinite Loop](#problem-6-infinite-loop)
   - [Problem 7: Count of Positive, Negative, and Zero Numbers](#problem-7-count-of-positive-negative-and-zero-numbers)
   - [Problem 8: Power of a Number](#problem-8-power-of-a-number)
   - [Bonus Problem 1: Greatest Common Divisor (GCD)](#bonus-problem-1-greatest-common-divisor-gcd)
   - [Bonus Problem 2: Fibonacci Series](#bonus-problem-2-fibonacci-series)

---

## Practice Questions

### Problem 1: Average of Three Numbers
**Task**: Enter 3 numbers from the user and create a function to print their average.

**Example**:
```java
double average(int a, int b, int c) {
    return (a + b + c) / 3.0;
}
```

### Problem 2: Sum of All Odd Numbers
**Task**: Write a function to print the sum of all odd numbers from 1 to `n`.

**Example**:
```java
int sumOfOddNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i += 2) {
        sum += i;
    }
    return sum;
}
```

### Problem 3: Greater of Two Numbers
**Task**: Write a function that takes in 2 numbers and returns the greater of those two.

**Example**:
```java
int greater(int a, int b) {
    return (a > b) ? a : b;
}
```

### Problem 4: Circumference of a Circle
**Task**: Write a function that takes in the radius as input and returns the circumference of a circle.  
**Formula**: Circumference = 2 * π * radius

**Example**:
```java
double circumference(double radius) {
    return 2 * Math.PI * radius;
}
```

### Problem 5: Voting Eligibility
**Task**: Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

**Example**:
```java
boolean isEligibleToVote(int age) {
    return age > 18;
}
```

### Problem 6: Infinite Loop
**Task**: Write an infinite loop using the `do-while` condition.

**Example**:
```java
do {
    System.out.println("This loop runs forever.");
} while (true);
```

### Problem 7: Count of Positive, Negative, and Zero Numbers
**Task**: Write a program to enter numbers till the user wants, and at the end, it should display the count of positive, negative, and zeros entered.

**Example**:
```java
void countNumbers() {
    Scanner sc = new Scanner(System.in);
    int positives = 0, negatives = 0, zeros = 0;
    char choice;

    do {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) positives++;
        else if (num < 0) negatives++;
        else zeros++;

        System.out.print("Do you want to enter another number? (y/n): ");
        choice = sc.next().charAt(0);
    } while (choice == 'y' || choice == 'Y');

    System.out.println("Positives: " + positives);
    System.out.println("Negatives: " + negatives);
    System.out.println("Zeros: " + zeros);
}
```

### Problem 8: Power of a Number
**Task**: Write a function to find the value of one number raised to the power of another, i.e., `x^n`.

**Example**:
```java
int power(int x, int n) {
    int result = 1;
    for (int i = 0; i < n; i++) {
        result *= x;
    }
    return result;
}
```

---

## Bonus Problems

### Bonus Problem 1: Greatest Common Divisor (GCD)
**Task**: Write a function that calculates the Greatest Common Divisor (GCD) of 2 numbers.

**Example**:
```java
int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```

### Bonus Problem 2: Fibonacci Series
**Task**: Write a program to print the Fibonacci series of `n` terms where `n` is input by the user.

**Example**:
```java
void printFibonacci(int n) {
    int a = 0, b = 1;
    System.out.print(a + " " + b);

    for (int i = 2; i < n; i++) {
        int next = a + b;
        System.out.print(" " + next);
        a = b;
        b = next;
    }
}
```

---

## Conclusion

This class is a collection of practice problems designed to help you apply your understanding of functions in Java. Each problem focuses on a specific concept, from basic arithmetic operations to more advanced topics like recursion and loops. Completing these exercises will improve your ability to write clear, efficient, and reusable code.