package Loops;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        /*
            do-while executes the do block first,
            then checks the condition.
         */
        do{
            // 11 is never printed, Because printing happens BEFORE increment, and the loop stops before the next print.
            System.out.println(counter);
            counter++;

            //now 11 WILL be printed, because increment happens BEFORE printing, and the loop stops after the next print.
            // counter++;
            // System.out.println(counter);
            
        }while(counter<=10);
    }
}
