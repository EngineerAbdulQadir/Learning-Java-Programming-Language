public class FourteenthClass {
    public static void main(String[] args) {
        // Operators and Binary Number System

        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Unary Operators
        int x = 5;
        System.out.println("Pre-Increment: " + (++x));
        System.out.println("Post-Increment: " + (x++));
        System.out.println("Value after Post-Increment: " + x);

        int y = 5;
        System.out.println("Pre-Decrement: " + (--y));
        System.out.println("Post-Decrement: " + (y--));
        System.out.println("Value after Post-Decrement: " + y);

        // Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        // Logical Operators
        boolean p = true;
        boolean q = false;
        System.out.println(p && q);
        System.out.println(p || q);
        System.out.println(!p);

        // Bitwise Operators
        x = 5;  // 0101
        y = 3;  // 0011
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);

        // Assignment Operators
        a += 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);

        // Binary Number System
        int binary = 0b101;
        System.out.println("Binary 101 in decimal: " + binary);
        int number = 4;
        System.out.println("Decimal 4 in binary: " + Integer.toBinaryString(number));

        // Octal
        int octal = 010;
        System.out.println("Octal 010 in decimal: " + octal);

        // Hexadecimal
        int hex = 0xA;
        System.out.println("Hexadecimal 0xA in decimal: " + hex);
    }
}
