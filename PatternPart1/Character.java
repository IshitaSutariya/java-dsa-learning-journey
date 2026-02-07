package PatternPart1;
import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for rows of character pattern you want to print: ");
        int n = sc.nextInt();
        char ch = 'A';
        // 1st way to print the pattern - if dont think about that there are only 26 letters in the english alphabet.
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                    System.out.print(ch);
                    ch++;
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        /*
        2nd way to print the pattern - if we want to print the pattern for more than 26 rows then
        */

        // 1 method) we can use the modulus operator to wrap around the characters.
        int count = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char ch1 = (char)('A' + (count%26)); // this will WRAP around after Z
                System.out.print(ch1);
                count++;
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        // 2 Method) we can reset the character back to 'A' after reaching 'Z' - using an if condition
        char ch2 = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch2);
                ch2++;

                if(ch2 > 'Z'){  // if I write ch2 == 'Z' then it will Skip Z and then reset to A, but we want to reset after Z is printed
                    ch2 = 'A'; // reset back to 'A' after reaching 'Z'
                }
            }
            System.out.println();
        }
    }
}
