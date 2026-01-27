import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        // int a = 25;
        // long b = a;

        // long a = 4;
        // int b = a;      // will throw error

        // System.out.println(b);

        // -----------------------

        Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();           // will throw error
        float number = sc.nextInt();
        System.out.println(number);
    }
}
