// import java.util.*;

// public class SeventhClass {
//     /// Functions And Methods
//     // Print a Given Name in a Function
//     // Make a function to add 2 numbers and return the sum
//     public static void printMyName (String name) { // CamelCase
//         System.out.println(name);
//         return;
//     } 
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);  
//       int a = sc.nextInt();
//       int b = sc.nextInt();
      
//       printMyName(name); // Calling Function
//     }
// }

// import java.util.*;

// public class SeventhClass {
//     /// Functions And Methods
//     // Make a function to add 2 numbers and return the sum
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);  
//       int a = sc.nextInt();
//       int b = sc.nextInt();
      
//       int sum = calculateSum(a, b);
//       System.out.println("Sum of 2 Number is : " + sum);
//     }
// }

// import java.util.*;

// public class SeventhClass {
//     /// Functions And Methods
//     // Make a function to multiply 2 numbers and return the product
//     public static int calculateProduct(int a, int b) {
//         return a * b; // Directly
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);  
//       int a = sc.nextInt();
//       int b = sc.nextInt();
      

//       System.out.println("Product of 2 Number is : " + calculateProduct(a, b));
//     }
// }

// import java.util.*;

// public class SeventhClass {
//     /// Functions And Methods
//     // Find the factorial of a number
//     public static void printFactorial(int n) {
//         //loop
//         if(n < 0) {
//             System.out.println("Invalid Number");
//             return;
//         }
//         int factorial = 1;


//         for(int i=n; i>=1; i--) {
//             factorial = factorial * i;
//         }


//         System.out.println(factorial);
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();


//         printFactorial(n);
//     }
// }