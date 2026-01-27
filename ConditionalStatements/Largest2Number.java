package ConditionalStatements;

import java.util.Scanner;

public class Largest2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 2 numbers, get largest number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b)   // if is one line then , not compulsory to use curly brackets. But it is good practice to use.
            // System.out.println(a); System.out.println(" is the largest"); 
            System.out.println(a + " is the largest");
         else            // System.out.println(b); System.out.println(" is largest");  // This will print in new line
            System.out.println(b + " is the largest");
        
    }
}
