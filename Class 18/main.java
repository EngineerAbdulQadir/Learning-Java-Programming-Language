/// Recursion Part 02
/* public class main {
    public static void printNumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n+1); // Recursion Applied
    }
    public static void main(String[] args) {
        // Q2. Print numbers from 1 to 5.
        int n = 1; 
        printNumb(n); 

    }
} */
/* public class main {
    public static void printNumb(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(n);
        printNumb(n+1); // Recursion Applied
    }
    public static void main(String[] args) {
        /// Recursion Part 02
        // Q3. Print the first n natural numbers.
        int n = 1; 
        printNumb(n); 

    }
} */
// public class main {
//     public static void printSum(int n, int sum) {
//         if (n == 0) {
//             System.out.println(sum);
//             return;
//         }
//         sum += n;
//         printSum(n - 1, sum);
//     }

//     public static void main(String args[]) {
//         // Q4. Print the sum of first n natural numbers.
//         printSum(5, 0);
//     }
// }
public class main {
    public static void printFactorial(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFactorial(n - 1, fact);
    }

    public static void main(String args[]) {
        // Q5. Print factorial of a number n.
        printFactorial(5, 1);
    }
}