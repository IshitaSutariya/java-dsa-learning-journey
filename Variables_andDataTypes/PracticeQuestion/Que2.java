package PracticeQuestion;

import java.util.Scanner;
// input can be int also
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of square, give a value - side of a square");
        double s = sc.nextDouble();

        // double sq = s*s;
        System.out.println(s*s);

    }
}
