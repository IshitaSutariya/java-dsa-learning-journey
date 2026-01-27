package ConditionalStatements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Simple Calculator : +, -, *, /, %");
        System.out.println("Enter two numbers and an operator");
        System.out.println("Enter 1st number: "); 
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        double b = sc.nextInt();
        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        }
}
