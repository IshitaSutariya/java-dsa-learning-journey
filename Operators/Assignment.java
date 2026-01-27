package Operators;

public class Assignment {
    public static void main(String[] args) {
        int A = 10;
        A = A + 10;
        System.out.println(A);
        A += 10;
        System.out.println(A);

        int B=10;
        B=B-5;
        System.out.println(B);
        B-=5;
        System.out.println(B);

        int C=2;
        C = C*4;
        System.out.println(C);
        C*=4;
        System.out.println(C);

        int D=4;
        D = D/2;
        System.out.println(D);
        D/=2;
        System.out.println(D);

        int E = 25;
        E=E%5;
        System.out.println(E);
        E%=5;
        System.out.println(E);

    }
}
