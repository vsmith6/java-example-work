package seats;


import java.util.ArrayList;
import java.util.Scanner;

public class SeatReservation {
   /*** Methods for ArrayList of Seat objects ***/
   public static void makeSeatsEmpty(ArrayList<Seat> seats) {
      int i;
      for (i = 0; i < seats.size(); ++i) {
         seats.get(i).makeEmpty();
      }
   }

   public static void printSeats(ArrayList<Seat> seats) {
      int i;
      for (i = 0; i < seats.size(); ++i) {
         System.out.print(i + ": ");
         seats.get(i).print();
      }
   }

   public static void addSeats(ArrayList<Seat> seats, int numSeats) {
      int i;
      for (i = 0; i < numSeats; ++i) {
         seats.add(new Seat());
      }
   }
   /*** End methods for ArrayList of Seat objects ***/

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String usrInput;
      String firstName, lastName;
      int amountPaid;
      int seatNumber;
      Seat newSeat;
      ArrayList<Seat> allSeats = new ArrayList<Seat>();

      usrInput = "";

      // Add 5 seat objects to ArrayList
      addSeats(allSeats, 5);

      // Make all seats empty
      makeSeatsEmpty(allSeats);

      while (!usrInput.equals("q")) {

         System.out.println();
         System.out.println("Enter command (p/r/q/d): ");
         usrInput = scnr.next();

         if (usrInput.equals("p")) { // Print seats
            printSeats(allSeats);
         }
         else if (usrInput.equals("r")) { // Reserve seat
            System.out.println("Enter seat num: ");
            seatNumber = scnr.nextInt();

            if ( !(allSeats.get(seatNumber).isEmpty()) ) {
               System.out.println("Seat not empty.");
            }
            else {
               System.out.println("Enter first name: ");
               firstName = scnr.next();
               System.out.println("Enter last name: ");
               lastName = scnr.next();
               System.out.println("Enter amount paid: ");
               amountPaid = scnr.nextInt();

               newSeat = new Seat(); // Create new Seat object
               newSeat.reserve(firstName, lastName, amountPaid); // Set fields
               allSeats.set(seatNumber, newSeat); // Add new object to ArrayList

               System.out.println("Completed.");
            }
         }
         // FIXME: Add option to delete reservations
         else if (usrInput.equals("q")) { // Quit
            System.out.println("Quitting.");
         }
         else if(usrInput.equals("d")) {
            makeSeatsEmpty(allSeats);
         }
         else {
            System.out.println("Invalid command.");
         }
      }
   }
}