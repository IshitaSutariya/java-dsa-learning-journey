package ConditionalStatements.PracticeQuestion;
import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        System.out.println("Find a number is positive or negative.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int a = sc.nextInt();

        String result = (a>0)? "The number is Positive" : "The number is Negative";
        System.out.println(result);

        
    }
}
