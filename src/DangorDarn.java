import java.util.Scanner;

public class DangorDarn {

	
		   public static void main (String [] args) {
		      Scanner scnr = new Scanner(System.in);
		      String userInput;

		      userInput = scnr.nextLine();

		      /* Your solution goes here  */
		      // the trick here is that they didn't want any capital letters in the "darn"
		
		     
		        
		       if (userInput.indexOf("darn") != -1) {
			         System.out.println("Censored");
			      }
			       else {
			    	   System.out.println(userInput);
			       }
		  
		   }
		}


