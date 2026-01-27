package Loops.PracticeQuestion;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n;
    int choice;
    int evenSum = 0;
    int oddSum = 0;

    do{
        System.out.print("Enter a number: ");
       int n = sc.nextInt();
        if(n%2==0){
            evenSum += n;
        } else{
            oddSum += n;
        }
        System.out.print("Do you want to continue? (Enter 0 to stop, any other number to continue): ");
        choice = sc.nextInt();
    }while (choice != 0);  //Accept ANY non-zero number as “Yes”
    // while(choice==1); //Repeat the loop ONLY if choice is exactly 1, it accept any input even if write 3 as input then also loop will stop

    System.out.println("Sum of Even numbers: " + evenSum);
    System.out.println("Sum of Odd numbers: " + oddSum);
    }
}
