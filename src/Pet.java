
public class Pet {
	
	//  create attributes with the correct type
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int daysStay;
	private Double amountDue;
	
	// create public class methods
	
	   public void getPet() {
		   //TO DO finish method when given information
		   System.out.print("this is the getPet method");
		 //  return;
	   }
	   public void checkIn() {
		   //TO DO finish method when given information
		   
	   }
	   public void checkOut() {
		   //TO DO finish method when given information
		   
	   }
	   public void createPet() {
		   //TO DO finish method when given information
		   
	   }
	   public void updatePet() {
		   //TO DO finish method when given information
		   
	   }
	   
	   // define constructor for Pet
	
	   public Pet() {  
		      petType = "Caterpillar";    
		      petName = "Damian";
		      petAge = 99;
		      dogSpace = 29;
		      daysStay = 3;
		      amountDue = 40.00;
		   
		   }
	
	//  create accessors and modifiers - getters and setters
	  public void setPetType(String typeOfPet) {
	      petType = typeOfPet;
	   }
	  
	   public String getPetType() {
		      return petType;
		   }
	   public void setPetName(String userPetName) {
		   petName = userPetName;
		   
	   }
	   public String getPetName() {
		   return petName;
	   }
	   public void setPetAge(int userPetAge) {
		   petAge = userPetAge;
	   }
	   public int getPetAge() {
		   return petAge;
	   }
	   
	   public void setDogSpace(int userDogSpace) {
		   dogSpace = userDogSpace;
	   }
	   public int getDogSpace() {
		   return dogSpace;
	   }
	   
	   public void setDaysStay(int petDaysStay) {
		   daysStay = petDaysStay;
	   }
	   public int getDaysStay() {
		   return daysStay;
	   }
	   
	   public void setAmountDue(double userAmountDue) {
		   amountDue = userAmountDue;
	   }
	   public double getAmountDue() {
		   return amountDue;
	   }
	   
	
	// print statement that will print values of the Pet class
	   public void print() {
		      System.out.println("Pet type: " + petType);
		      System.out.println("Pet Name: " + petName);
		      System.out.println("Pet Age: " + petAge);
		      System.out.println("Dog Space: " + dogSpace);
		      System.out.println("Days Staying: " + daysStay);
		      System.out.println("Amount Due: " + amountDue);
		    
		   }  
	      
	   

}



