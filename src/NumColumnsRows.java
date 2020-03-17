import java.util.Scanner;
public class NumColumnsRows {

	public static void main (String [] args) {
	    Scanner scnr = new Scanner(System.in);

		int numRows;

		int numCols;

		int i,j;

		char ch = 'A';
		
	    numRows = scnr.nextInt();
	    numCols = scnr.nextInt();

		

		/* Your solution goes here */

		for ( i = 0; i < numRows; i++) { // Outer loop runs for numRows times

		for ( j = 0; j < numCols; j++) { // Inner loop runs for numCols times

		System.out.print(i+1);

		System.out.print((char)(ch+j));

		System.out.print(" ");

		}

		}

		System.out.println("");

		return;

	}		

}
