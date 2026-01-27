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
        System.out.println("Sum of natural numbers from 1 to " + i + " is: " + sum);
    }
}
