package PracticeQuestion;

import java.util.Scanner;
// input can be int also
public class Que1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any three numbers to Calculate average of it");
        double A =sc.nextDouble();
        double B =sc.nextDouble();
        double C =sc.nextDouble();

        float avg = (float)(A+B+C)/3;

        System.out.println("Average =" + avg);

    }
}