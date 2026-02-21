package PatternPart1.Practice;
import java.util.Scanner;

public class PalindromicWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want to print the palindromic pyramid: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Leading spaces for pyramid shape
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Count DOWN from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Count UP from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
