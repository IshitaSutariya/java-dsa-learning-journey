package PatternPart1.Practice;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of butterfly you want to print: ");
        int n = sc.nextInt();

        //Upper half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");     // "*"      // "* "         //" * "
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");   // " "       // "  "        // "   "
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");   // "*"    // "* "       // " * "
            }
            System.out.println();
        }

        //Lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");     // "*"      // "* "         //" * "
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");   // " "       // "  "        // "   "
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");   // "*"    // "* "       // " * "
            }
            System.out.println();
        }


        // CLEANER CODE

        /*
        
        for (int i = 1; i <= 2 * n; i++) {

            int stars = i <= n ? i : 2 * n - i + 1;
            int spaces = 2 * (n - stars);

            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");

            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            System.out.println();
        }

        */

    }
}