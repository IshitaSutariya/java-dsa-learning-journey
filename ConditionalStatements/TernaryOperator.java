package ConditionalStatements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is even or odd:");
        int num = sc.nextInt();
        // Ternary Operator
        String type = (num %2 == 0)? "Even":"Odd";
        System.out.println("the number " + num + " is " + type);
    }
}
