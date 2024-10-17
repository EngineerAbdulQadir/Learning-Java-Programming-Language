public class main {
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n-1); // Recursion Applied
    }
    public static void main(String[] args) {
        ///  Recursion Part 01
        // Prerequisites:
        // Iteration / Loops
        // Functions

        // Q1. Print numbers from 5 to 1.
        int n = 5; 
        printNumb(n); 

    }

    // What Happens In Memory?
}