package PatternPart1.Practice;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want to print the pyramid: ");
        int n = sc.nextInt();
        /*
            1 
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5

       
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        */

        /*
        After 9, formation breaks because of 2 digit numbers. 
                                 1 
                                2 2
                               3 3 3
                              4 4 4 4
                             5 5 5 5 5 
                            6 6 6 6 6 6
                           7 7 7 7 7 7 7
                          8 8 8 8 8 8 8 8
                         9 9 9 9 9 9 9 9 9
                        10 10 10 10 10 10 10 10 10 10
                       11 11 11 11 11 11 11 11 11 11 11
                      12 12 12 12 12 12 12 12 12 12 12 12 
                     13 13 13 13 13 13 13 13 13 13 13 13 13
                    14 14 14 14 14 14 14 14 14 14 14 14 14 14
                   15 15 15 15 15 15 15 15 15 15 15 15 15 15 15
                  16 16 16 16 16 16 16 16 16 16 16 16 16 16 16 16
        */
       
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        
    }
}
