import java.io.Console;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // -------error- lossy conversion---------------

        // float a = 25.999f;
        // int b =a;
        // System.out.println(b);

        // ---------------type casting---------------

        float a = 25.7889f;
        int b = (int) a;  // .7889 this data willl be lost
        System.out.println(b);

        // ----------- character type conversion --------------
        char ch ='a';
        char ch2 = 'b';
        int num1 = ch;
        int num2 = ch2;
        int diff = ch2 - ch;
        char ch3 = (char)(ch2 - ch);
        System.out.println("Difference between b and a is: " + diff);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Character difference is: " + ch3);  // (char)1 → non-printable control character . Console shows nothing
        char ch4 = (char) ('0' + diff);
        System.out.println("Character difference is: " + ch4);
        
        System.out.println((char)('0' + 10)); // '0' + 10 → 48 + 10 → 58 → ':'  
        System.out.println(('0' + 10));// '0' + 10 → 48 + 10 → 58 → int 58

        sc.close();
        /*
        Numbers 0–31 → mostly invisible control characters
        '0'–'9' start at 48

        Mental rule to remember 🧠

        'a' + 1 → 'b'

        '0' + 1 → '1'

        (char)1 → ❌ invisible character
        */
    }
}
