package Loops;

public class ContinueExample {
    public static void main(String[] args) {
        // Display all numbers entered by user except multiples of 10
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // it is infinite loop example
        do{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num%10 ==0){
                System.out.println("Multiple of 10 entered, skipping the print.");
                continue;
            }
            System.out.println("Number was: " + num);
        }while(true);

    }
}
