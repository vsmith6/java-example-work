import java.util.Scanner;

public class HourToMinConv {
	
	
	
   public static void outputMinutesAsHours(double origMinutes) {
	   double hours = 60.0;
	   double convertMins = origMinutes / hours;

		      System.out.print(convertMins);

		   }

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double minutes;

	      minutes = scnr.nextDouble();

	      outputMinutesAsHours(minutes); // Will be run with 210.0, 3600.0, and 0.0.
	      System.out.println("");
	   }

	}


