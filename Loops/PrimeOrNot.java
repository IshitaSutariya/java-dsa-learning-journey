package Loops;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        int limit = (int) Math.sqrt(num);

        if(num<2){
            System.out.println(num + " is not a prime number. " );
        }
        else if (num == 2){
            System.out.println(num + " is a prime number. " );
        }
        else{
            boolean isPrime = true;
            for (int i =2; i<= limit; i++){
            // for(int i = 2; i<=num-1; i++){           ---- less efficient way, it is costly for large numbers
            
                if(num % i == 0){
                    isPrime = false;
                    break; 
                }
            }
        if(isPrime){
            System.out.println(num + " is a prime number. ");
        } else {
            System.out.println(num + " is not a prime number. ");
        }
        }
    }
}
