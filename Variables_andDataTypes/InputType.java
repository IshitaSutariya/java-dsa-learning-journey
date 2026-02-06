import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input =sc.next();  // for single word input
        System.out.println(input);

        String input2 = sc.nextLine(); 
        // for multiple word input, it will take the input after the first input and print it. 
        // if we want to take the input from the user then we have to use nextLine() method twice. 
        // first time it will take the input from the user and second time it will take the input from the user and print it.
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
