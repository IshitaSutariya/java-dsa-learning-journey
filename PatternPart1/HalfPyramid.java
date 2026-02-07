package PatternPart1;
import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of till which you want to print in the half pyramid: ");
        int n = sc.nextInt();
        System.out.println("-----------------------------");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
