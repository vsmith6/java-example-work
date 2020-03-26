
import java.util.Scanner;

public class StoreDoubles {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_DOUBLES= 5;
      Double[] userDoubles = new Double[NUM_DOUBLES];
      int i;

      /* Your solution goes here  */
     for(i = 0; i < userDoubles.length; ++i){
          userDoubles[i] = scnr.nextDouble();
      }
     
     System.out.print("You Entered: ");

      for (i = 0; i < userDoubles.length; ++i){
    	 // System.out.println("");
      //   System.out.print("You entered: ");
         System.out.print(userDoubles[i] + " ");
      }
   }
}
