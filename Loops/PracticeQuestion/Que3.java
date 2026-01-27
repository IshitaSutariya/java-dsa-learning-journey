package Loops.PracticeQuestion;
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        // tofind the factorial of a number entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        
        for(int i =1 ; i<=n; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: "+ factorial);
    }
}
