package Loops;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number until which natural numbers will be printed: ");
        int n = sc.nextInt();
        int i =1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

    }
}
