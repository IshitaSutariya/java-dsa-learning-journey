package PracticeQuestion;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To get Bill : Enter cost of respective items");
        System.out.println("1. Pencil ");
        float pl = sc.nextFloat();
        System.out.println("2. Pen  ");
        float p = sc.nextFloat();
        System.out.println("3. eraser  ");
        float er = sc.nextFloat();
        System.out.println("");
        float cost = pl+p+er;
        System.out.println("Total Cost: " + cost);
        float gst = (cost*0.18f);
        System.out.println("Final Billwith 18% tax : " + (cost+gst));

    }
}
