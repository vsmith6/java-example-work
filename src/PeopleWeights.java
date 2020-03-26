
import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      /* Type your code here. */
   Scanner reader = new Scanner(System.in); 

     double weightOne = reader.nextDouble();
     System.out.println("Enter weight 1: ");
     double weightTwo = reader.nextDouble();
     System.out.println("Enter weight 2: ");
     double weightThree = reader.nextDouble();
     System.out.println("Enter weight 3: ");
     double weightFour = reader.nextDouble();
     System.out.println("Enter weight 4: ");
     double weightFive = reader.nextDouble();
     System.out.println("Enter weight 5: ");
     System.out.println();
      double sum = weightOne + weightTwo + weightThree + weightFour + weightFive;
      double[] MyArray = new double[5];
      MyArray[0] = weightOne;
      MyArray[1] = weightTwo;
      MyArray[2] = weightThree;
      MyArray[3] = weightFour;
      MyArray[4] = weightFive;
      int i;
       System.out.print("You entered: ");
          for (i = 0; i < MyArray.length; ++i){
         System.out.print(MyArray[i] + " ");
      }
    
    
      double average = sum / 5;
      System.out.println();
      System.out.println("Total weight: " + sum);
      System.out.println("Average weight: " + average);
      
      double max = MyArray[0];
      for (int counter = 1; counter < MyArray.length; counter++){
         if (MyArray[counter] > max){
            max = MyArray[counter];
         }
      }
      System.out.println("Max weight: " + max);
      
      return;
   }
}