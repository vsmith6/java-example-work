public class Dog {
	
	// create attributes with correct type
	private int dogSpaceNbr;
	
	private double dogWeight;
	
	private boolean grooming;
	

	
	
	//set constructor for items specific to Dog class
	
	   public Dog() { 
		      dogSpaceNbr = 28;    
		      dogWeight = 40;
		      grooming = false;
		   }
	
	// create modifiers and accessors for Dog class
	
	public void setDogWeight(double userDogWeight) {
		dogWeight = userDogWeight;
	}
	public double getDogWeight() {
		return dogWeight;
	}
	public void setGrooming(boolean dogGrooming) {
		grooming = dogGrooming;
	}
	public boolean getGrooming() {
		return grooming;
	}
	

	// set newDog as a new instance of the Pet class--> dont need this!!
	private Pet newDog;
	  public void setNewDog(Pet pet) {
	      newDog = pet;
	   }
	  
	public Pet getNewDog() {
		return  newDog;
	}
	
	
	
	
	//set a print instance to print dog class attributes as well as the items from the pet class new Dog
	public void print() {
				
		      System.out.println("Dog space number: " + dogSpaceNbr);
		      System.out.println("Dog Weight: " + dogWeight);
		      System.out.println("Grooming: " + grooming);
		      System.out.println("");
		  //    newDog.print();
		    
		      
		    
		   } 
	

	public static void main(String[] args) {
		//get the dog class and call him fido
		Dog fido = new Dog();
		
		// create a new instance of a pet class
		Pet newVisitor = new Pet();
		
		

		// tell Dog class we have a new pet instance called newDog
        fido.setNewDog(newVisitor);
        //newDog instance of Pet class setters/mutators
        newVisitor.setPetName("alfalfa");
        newVisitor.setAmountDue(199.99);
        newVisitor.setDaysStay(3);
        newVisitor.setDogSpace(6);
        newVisitor.setPetAge(16);
        newVisitor.setPetType("Dog");
        
        //getters accessors for Pet class via newDog
        newVisitor.getPetType();
        newVisitor.getPetName();
        newVisitor.getPetAge();
        newVisitor.getDogSpace();
        newVisitor.getDaysStay();
        newVisitor.getAmountDue();
        
        newVisitor.checkIn();
        newVisitor.checkOut();
        newVisitor.updatePet();
        newVisitor.createPet();
        
       
        
       
        fido.setDogWeight(45);
        fido.setGrooming(true);
        System.out.println("Pet Name: " + newVisitor.getPetName());
		
		
		fido.print();
		
		newVisitor.print();
		
		newVisitor.getPet();
		
	
	
   

	}
	
	
	
	
	
	
	
	
	
	
	
	
}


