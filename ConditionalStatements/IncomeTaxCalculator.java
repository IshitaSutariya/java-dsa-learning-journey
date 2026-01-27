package ConditionalStatements;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // sample of how tax calculation can be done using conditional statements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        double income = sc.nextDouble();
        double tax = 0;

        if(income < 0){
            System.out.println("Invalid income");
        }
        else if(income>= 0 && income <= 500000){
            tax=0;
        } else if(income > 500000 && income <= 1000000){
            tax = income * 0.2;
        } else{
            tax = income * 0.3;
        }
        System.out.printf("Your income tax is: Rs. %.2f%n", tax);
    }
}
