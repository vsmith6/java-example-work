import java.util.Scanner;

public class HeightPrinter {
	
	public static void printFeetInchShort(int userFeet, int userInches) {
		System.out.println(userFeet + "' " + userInches + "\"");
		
	}

	
	
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int userFeet;
	      int userInches;

	      userFeet = scnr.nextInt();
	      userInches = scnr.nextInt();

	      printFeetInchShort(userFeet, userInches);  // Will be run with (5, 8), then (4, 11)
	   }


}
