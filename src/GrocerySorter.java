
import java.util.Scanner;

public class GrocerySorter {
   public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};

   public static void main (String [] args) {
	   Scanner scnr = new Scanner(System.in);
      GroceryItem userItem;

      userItem = GroceryItem.GR_APPLES;
      
      String input = scnr.next();

      input = GroceryItem(input);
      /* Your solution goes here  */
      if(userItem == GroceryItem.GR_APPLES || userItem == GroceryItem.GR_BANANAS) {
         System.out.println("Fruit");
      }
      else if(userItem == GroceryItem.GR_JUICE || userItem == GroceryItem.GR_WATER){
         System.out.println("Drink");
      }

   }

private static String GroceryItem(String input) {
	// TODO Auto-generated method stub
	return null;
}
}