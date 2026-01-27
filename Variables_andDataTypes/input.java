import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input =sc.next();
        System.out.println(input);

        String input2 = sc.nextLine();
        System.out.println(input2);
        
        int num = sc.nextInt();
        System.out.println(num);

        float f = sc.nextFloat();
        System.out.println(f);

        byte b = sc.nextByte();
        System.out.println(b);

        short s=sc.nextShort();
        System.out.println(s);

        boolean o = sc.nextBoolean();
        System.out.println(o);

        long l = sc.nextLong();
        System.out.println(l);

    }
}
