package PatternPart1.Practice;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Upper half of the diamond
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for(int i=rows-1; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // another way to do
        
        /*
        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars = i <= n ? i : 2 * n - i;
            
            for (int j = 1; j <= n - stars; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * stars - 1; j++)
                System.out.print("*");

            System.out.println();
        }
        */ 
        
    }    
}
