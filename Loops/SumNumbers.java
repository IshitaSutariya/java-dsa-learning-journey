package Loops;
import  java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number until which natural numbers will be summed: ");
        int n = sc.nextInt();
        int i = n;
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }

        /*
        for (int j = n; j > 0; j--) {
            sum += j;
        }
        */

        /*
        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        */
       //  int sum = n * (n + 1) / 2; // Formula for sum of first n natural numbers

        System.out.println("Sum of natural numbers from 1 to " + i + " is: " + sum);
    }
}
