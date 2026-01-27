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
        System.out.println(num1);
        System.out.println(num2);
    }
}
