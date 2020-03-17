import java.util.Scanner;

public class CalcPyramidVolume {
	
	
	public static double pyramidVolume(double userLength, double userWidth, double userHeight) {
		double volume;
		double baseArea;
		
				
		baseArea = userLength * userWidth;	
		volume = baseArea * userHeight * (1.0/3.0);
		return volume;
	}

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double userLength;
	      double userWidth;
	      double userHeight;

	      userLength = scnr.nextDouble();
	      userWidth = scnr.nextDouble();
	      userHeight = scnr.nextDouble();

	      System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
	   }

}
