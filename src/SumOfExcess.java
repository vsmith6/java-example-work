
import java.util.Scanner;

public class SumOfExcess {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] testGrades = new int[NUM_VALS];
      int i;
      int sumExtra = -9999; // Assign sumExtra with 0 before your for loop

      for (i = 0; i < testGrades.length; ++i) {
         testGrades[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      sumExtra = 0;
      int newSum;
      for(i=0; i< testGrades.length; ++i) {
         if (testGrades[i] > 100) {
           newSum = testGrades[i] - 100;
           sumExtra = sumExtra + newSum;
         }
      }

      System.out.println("sumExtra: " + sumExtra);
   }
}
