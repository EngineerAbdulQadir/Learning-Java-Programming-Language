public class SixthClass {
    public static void main(String[] args) {
        /// Advanced Patterns
        // Pattern 10 - Butterfly Pattern
        // int n = 5;

        // // Upper Half
        // for(int i=1; i<=n; i++) {
        //    // Fisrt Part
        //    for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //    }
        //    // Spaces
        //    int spaces = 2 * (n-i);
        //    for(int j=1; j<=spaces; j++) {
        //         System.out.print(" ");
        //    }

        //    // Second Part
        //    for(int j=1; j<=i; j++) {
        //      System.out.print("*");
        //    }
        //    System.out.println();
        // }

        // // Lower Half
        // for(int i=n; i>=1; i--) {
        //     // Fisrt Part
        //     for(int j=1; j<=i; j++) {
        //          System.out.print("*");
        //     }
        //     // Spaces
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++) {
        //          System.out.print(" ");
        //     }
 
        //     // Second Part
        //     for(int j=1; j<=i; j++) {
        //       System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        // Pattern 11 - Solid Rhombus
        // int n = 5;
        // for(int i=1; i<=n; i++) {
        //     // Space
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     // Stars
        //     for(int j=1; j<=5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

        // Pattern 12 - Number Pyramid
        // int n = 5;
        // for(int i=1; i<=n; i++) {
        //     // Spaces 
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Numbers --> Print row numbers --> Row numbers time
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Pattern 13 - Palindromic Pattern
        // int n =5;
        // for(int i=1; i<=n; i++) {
        //     // Spaces
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // First Half Numbers
        //     for(int j=i; j>=1; j--) {
        //         System.out.print(j);
        //     }

        //     // Second Half Numbers
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // Pattern 14 - Diamond Pattern
        // int n =4;
        // // Upper Half
        // for(int i=1; i<=n; i++) {
        //     // Spaces
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // Lower Half
        // for(int i=n; i>=1; i--) {
        //     // Spaces
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Stars
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
    
        // }
    }
}