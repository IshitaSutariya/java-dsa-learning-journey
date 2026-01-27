package ConditionalStatements.PracticeQuestion;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        System.out.println("Enter your thermometer reading:");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();

        String state= (temp > 100)? "You have a fever." : "You don't have a fever.";
        System.out.println(state);
    }
}
