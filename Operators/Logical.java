package Operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("---------AND----------");
        System.out.println((3>2) &&(5>0));
        System.out.println((3>2) &&(5<0));
        System.out.println((3<2) &&(5>0));
        System.out.println((3<2) &&(5<0));
        System.out.println("---------OR------------");
        System.out.println((3>2) ||(5>0));
        System.out.println((3>2) || (5<0));
        System.out.println((3<2) || (5>0));
        System.out.println((3<2) || (5<0));
        System.out.println("---------NOT-----------");
        System.out.println(!(3>2));
        System.out.println(!(3<2));
    }
}
