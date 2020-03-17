import java.util.Scanner;

public class CalculusToFahrenheit {
	public static double celsiusToFahrenheit(double tempC) {
		double convertTemp;
		
		
		convertTemp = (9.0/5.0)*tempC + 32.0;
		
		return convertTemp;
		

	}

	
	
	
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	      double tempF;
	      double tempC;

	      System.out.println("Enter temperature in Celsius: ");
	      tempC = scnr.nextDouble();

	      tempF = celsiusToFahrenheit(tempC);

	      System.out.println("Fahrenheit: " + tempF);
	      System.out.println(tempF);
	      System.out.println( " is fahrenheit" + tempF);
	   }


}
