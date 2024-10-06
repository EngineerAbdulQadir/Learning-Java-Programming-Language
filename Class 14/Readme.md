# Java Class 14 - Operators and Binary Number System

In this class, we will dive into the **Operators** used in Java and the **Binary Number System**. Understanding how operators work in conjunction with different number systems, including binary, octal, and hexadecimal, is essential to writing efficient code.

## Table of Contents
1. [Operators in Java](#operators-in-java)
   - [Arithmetic Operators](#arithmetic-operators)
   - [Unary Operators](#unary-operators)
     - [Pre-Increment and Post-Increment](#pre-increment-and-post-increment)
     - [Pre-Decrement and Post-Decrement](#pre-decrement-and-post-decrement)
   - [Relational Operators](#relational-operators)
   - [Logical Operators](#logical-operators)
   - [Bitwise Operators](#bitwise-operators)
   - [Assignment Operators](#assignment-operators)
2. [Binary Number System](#binary-number-system)
   - [Decimal to Binary Conversion](#decimal-to-binary-conversion)
   - [Binary to Decimal Conversion](#binary-to-decimal-conversion)
   - [Other Number Systems](#other-number-systems)
     - [Octal System](#octal-system)
     - [Hexadecimal System](#hexadecimal-system)
3. [Homework](#homework)
4. [Conclusion](#conclusion)

---

## Operators in Java

Operators are special symbols used to perform operations on variables and values. Java supports different types of operators, which are categorized below:

### Arithmetic Operators
These operators are used to perform common mathematical operations such as addition, subtraction, multiplication, and division:
- `+` (Addition)
- `-` (Subtraction)
- `*` (Multiplication)
- `/` (Division)
- `%` (Modulus)

### Unary Operators
Unary operators are used with a single operand and include increment and decrement operations:

#### Pre-Increment and Post-Increment
- **Pre-Increment (`++a`)**: Increments the value of `a` and then returns the updated value.
- **Post-Increment (`a++`)**: Returns the current value of `a` and then increments it.

#### Pre-Decrement and Post-Decrement
- **Pre-Decrement (`--a`)**: Decrements the value of `a` and then returns the updated value.
- **Post-Decrement (`a--`)**: Returns the current value of `a` and then decrements it.

### Relational Operators
Relational operators are used to compare two values:
- `==` (Equal to)
- `!=` (Not equal to)
- `>` (Greater than)
- `<` (Less than)
- `>=` (Greater than or equal to)
- `<=` (Less than or equal to)

### Logical Operators
Logical operators are used to combine multiple conditions:
- `&&` (Logical AND)
- `||` (Logical OR)
- `!` (Logical NOT)

### Bitwise Operators
Bitwise operators are used to perform operations on binary representations of integers:
- `&` (Bitwise AND)
- `|` (Bitwise OR)
- `^` (Bitwise XOR)
- `~` (Bitwise NOT)
- `<<` (Left shift)
- `>>` (Right shift)

### Assignment Operators
Assignment operators are used to assign values to variables. Some common assignment operators include:
- `=` (Simple assignment)
- `+=` (Add and assign)
- `-=` (Subtract and assign)
- `*=` (Multiply and assign)
- `/=` (Divide and assign)

---

## Binary Number System

The binary number system, with a base of 2, uses only two digits: 0 and 1. Understanding binary is crucial in computer science as computers operate using binary data.

### Decimal to Binary Conversion
To convert a decimal number to binary, repeatedly divide the number by 2 and record the remainders.

Example: Convert 4 to binary:
- 4 ÷ 2 = 2 (remainder 0)
- 2 ÷ 2 = 1 (remainder 0)
- 1 ÷ 2 = 0 (remainder 1)

So, 4 in binary is `100`.

### Binary to Decimal Conversion
To convert binary to decimal, multiply each binary digit by 2 raised to the power of its position, starting from 0.

Example: Convert `101` to decimal:
- 1 * 2² + 0 * 2¹ + 1 * 2⁰ = 4 + 0 + 1 = 5

### Other Number Systems

#### Octal System
The **octal system** has a base of 8 and uses digits from 0 to 7. It is often used as a shorthand for binary numbers.

#### Hexadecimal System
The **hexadecimal system** has a base of 16 and uses digits 0-9 and letters A-F to represent values from 10 to 15. Hexadecimal is commonly used in computing to simplify binary representations.

---

## Homework
1. Write a Java program to convert any decimal number to binary.
2. Convert the binary number `1101` to decimal.
3. Write a program to demonstrate the use of bitwise AND, OR, and XOR operators.
4. Write a Java program to explain the differences between pre-increment and post-increment using a simple example.

---

## Conclusion
In this class, we covered essential Java operators and how the binary number system works. Understanding these concepts is critical for performing calculations, logical operations, and working with different number systems in Java programming. Mastering these topics will enable you to write more efficient and optimized code.