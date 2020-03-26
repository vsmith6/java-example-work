
// ===== Code from file PhonePlan.java =====
public class PhonePlan {
   private int freeMinutes;
   private int freeMessages;

   public PhonePlan() {
       freeMinutes  = 0;
       freeMessages = 0;
    }

    // FIXME: Create a second constructor with numMinutes and numMessages parameters.

   /* Your solution goes here  */
   public PhonePlan(int minutes, int messages) {
      freeMinutes = minutes;
      freeMessages = messages;
   };

   public void print() {
      System.out.println("Minutes: " + freeMinutes + ", Messages: " + freeMessages);
   }
}
// ===== end =====
