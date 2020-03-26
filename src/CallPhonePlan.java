


// ===== Code from file CallPhonePlan.java =====
public class CallPhonePlan {
   public static void main (String [] args) {
      PhonePlan user1Plan = new PhonePlan(); // Calls default constructor
      PhonePlan user2Plan = new PhonePlan(2000, 10000); // Calls newly-created constructor

      System.out.print("User1: ");
      user1Plan.print();

      System.out.print("User2: ");
      user2Plan.print();
   }
}
// ===== end =====
