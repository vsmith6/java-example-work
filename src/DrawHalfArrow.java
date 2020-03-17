
import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;
      
      System.out.println("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width: ");
      
      arrowBaseWidth = scnr.nextInt();
      
      while (arrowHeadWidth <= arrowBaseWidth) {
          System.out.println("Enter arrow head width: ");
               arrowHeadWidth = scnr.nextInt();
           }
      
  
          for(int i = 0; i< arrowBaseHeight; ++i){
        	
             System.out.print("*");
          
          for(int j = 1; j < arrowBaseWidth; ++j) {
        
        	  System.out.print("*");
        	  
      } 
          System.out.println();
          }

          while(arrowHeadWidth >0) {
                 for(int m = arrowHeadWidth; m>=1; m--) {
                  System.out.print("*");
                  
          
          }
               
                 arrowHeadWidth--;
                 System.out.println("");
          }
 
      
      return;
   }
}
