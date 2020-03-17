
import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern;
      String userPattern;
      int userScore;
      int i;

      userScore = 0;

      simonPattern = scnr.next();
      userPattern  = scnr.next();


 char s;
 char u;
 for(i = 0; i< simonPattern.length(); i++){
    s = simonPattern.charAt(i);
    u = userPattern.charAt(i);
    if (s == u){
       userScore += 1;
    } else {
       break;
    }
 }
      System.out.println("userScore: " + userScore);

      return;
   }
}
