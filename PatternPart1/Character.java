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
            Why ch++ works even though ch is char:

            - In Java, char is internally stored as a number (Unicode value).
            Example: 'A' = 65, 'B' = 66

            - When we write: ch++
            Java internally does:
                1) Promote char to int (temporary widening)
                2) Add 1
                3) Automatically cast back to char
            Conceptually:
                ch = (char)(ch + 1);

            - This works because ++ operator automatically
            casts the result back to the original type.

            - Important:
                ch = ch + 1;     ❌ Error (int → char needs cast)
                ch = (char)(ch + 1);  ✅ Correct
                ch++;            ✅ Works
                ch += 1;         ✅ Works (auto-cast)

            So, ch++ increases the Unicode value of the character by 1.
        */

            
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
