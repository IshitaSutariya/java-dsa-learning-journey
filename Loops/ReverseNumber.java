package Loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // how to store a reverse number and then print it.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int LD = n %10;
            rev = (rev*10) + LD;
            n/=10;
        }
        System.out.println("Reversed number: " + rev);

        // another method to print reverse number without storing it
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int i = sc.nextInt();
        while(i<>0){
            int LD = i%10;
            System.out.print(LD);
            i/=10;
            }
        */

    }
}
