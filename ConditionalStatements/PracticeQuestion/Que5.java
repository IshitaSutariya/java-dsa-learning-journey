package ConditionalStatements.PracticeQuestion;
import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        System.out.println("To check whether a year is a leap year or not, enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String result = ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? year + " is a leap year." : year+"is not a leap year.";
        System.out.println(result);

    }
}
    