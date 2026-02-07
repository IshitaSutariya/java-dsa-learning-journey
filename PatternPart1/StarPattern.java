// package PatternPart1;

// public class StarPattern {
//     public static void main(String[] args){
//         for(int i =1; i<5; i++){             //if we want 10 rows then replace 5 with 10
//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// another way to print the same pattern
/*
    *
   **
  ***
 ****
*/

package PatternPart1;   
public class StarPattern {
    public static void main(String[] args){
        for(int i =1; i<5; i++){
            for(int j =1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}