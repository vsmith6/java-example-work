import java.util.Scanner;

public class NestedLoop {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int i;
      int j;

      userNum = scnr.nextInt();

      /* Your solution goes here  */
        i = 0;// i = number of spaces.
        j = 0;// j = Current number to display.
        while(i <= userNum){
            for(i = 1; i<=j; i++){
                System.out.print(" ");
            }
            System.out.println(j); // this is what gets the input number to go from 0 to whatever number is input
            ++j;
        }

   }
}
