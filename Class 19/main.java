/// Recursion Part 03
// public class main {
//     public static void printFactorial(int a, int b, int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(a);
//         printFactorial(b, a + b, n - 1);
//     }

//     public static void main(String args[]) {
//     // Q6. Print the fibonacci sequence till nth term.
//     printFactorial(0, 1, 10);
//     }
// }

// public class main {
//     public static int printPower(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         int x_ = printPower(x, n - 1);
//         int xn = x * x_;
//         return xn;
//     }

//     public static void main(String args[]) {
//         // Q7. Print x^n (with stack height = n)
//         int x = 2, n = 5;
//         int output = printPower(x, n);
//         System.out.println(output);
//     }
// }

public class main {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String args[]) {
        // Q8. Print x^n (with stack height = logn)
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}