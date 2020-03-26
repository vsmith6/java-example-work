
public class SNHUDog {
		
		// create attributes with correct type
		private int dogSpaceNbr;
		
		private double dogWeight;
		
		private boolean grooming;
		
		
		//set constructor for items specific to Dog class
		
		   public SNHUDog() { 
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
		
		// added these to assignment and got an A so I guess they are needed.
		public void getDogSpaceNbr(int userDogSpaceNbr){
			dogSpaceNbr = userDogSpaceNbr;
		}
		public int setDogSpaceNbr() {
			return dogSpaceNbr;
		}
		

		// set newDog as a new instance of the Pet class
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
			  
			   } 
		

		public static void main(String[] args) {
			// get a new instance of dog class and call him fido
			SNHUDog fido = new SNHUDog();
			
			
	       // use our new dog to set the new dog's weight and to offer grooming
	        fido.setDogWeight(45);
	        fido.setGrooming(true);
	
	  
		 //  see what the Dog object looks like	
			fido.print();
			
			
			
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
	        
	        // calling methods from the Pet class
	        newVisitor.checkIn();
	        newVisitor.checkOut();
	        newVisitor.updatePet();
	        newVisitor.createPet();
			newVisitor.getPet();
	        
			// see what the newVisitor looks like
			newVisitor.print();		

		}			
	
}


