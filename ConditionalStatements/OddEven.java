package ConditionalStatements;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's odd or even: ");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("EVEN");
        } else{
            System.out.println("ODD");
        }
    }
}