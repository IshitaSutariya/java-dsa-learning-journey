package Operators;

public class Unary{
    public static void main(String[] args) {
        int a1 =10;
        int b = a1++;
        System.out.println("Post Increment");
        System.out.println(a1);
        System.out.println(b);

        int a2 =10;
        int c = ++a2;
        System.out.println("Pre Increment");
        System.out.println(a2);
        System.out.println(c);

        int a3 =10;
        int d = --a3;
        System.out.println("Pre decrement");
        System.out.println(a3);
        System.out.println(d);

        int a4 =10;
        int e = a4--;
        System.out.println("Post Decrement");
        System.out.println(a4);
        System.out.println(e);
        
    }
}