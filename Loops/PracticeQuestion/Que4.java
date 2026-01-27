package Loops.PracticeQuestion;
import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        // To print the multiplication table of a given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its muliplication table: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){ 
            System.out.println(num + " x " + i +" = " + (num*i));
        }
    }
}

//Another way to solve the same problem:
/*

import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        printMultiplicationTable(num);
    }
}
    
*/