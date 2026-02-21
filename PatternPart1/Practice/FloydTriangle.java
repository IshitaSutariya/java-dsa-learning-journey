package PatternPart1.Practice;

import java.util.Scanner;

public class FloydTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows of Floyd's triangle you want to print: ");
        int n = sc.nextInt();
        int  x = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}