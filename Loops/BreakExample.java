package Loops;
import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        // Display all numbers entered by user -break when user enters multiple of 10
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                System.out.println("Multiple of 10 entered, breaking the loop.");
                break;
            }
            System.out.println(num);
        }
    }
}
