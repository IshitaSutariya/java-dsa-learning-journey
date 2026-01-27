import java.util.Scanner;

public class Input_user_practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // sum
        int sum = a + b;
        // product
        int product = a*b;
        // area of circle
        float radius = sc.nextFloat();
        float circle = 3.14f * radius*radius;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(circle);
    }
}
