
public class CarRecord {

	   private int yearMade;
	   private int vehicleIdNum;

	   public void setYearMade(int originalYear) {
	      yearMade = originalYear;
	   }

	   public void setVehicleIdNum(int vehIdNum) {
	      vehicleIdNum = vehIdNum;
	   }

	   public void print() {
	      System.out.println("Year: " + yearMade + ", VIN: " + vehicleIdNum);
	   }

	   // FIXME: Write constructor, initialize year to 0, vehicle ID num to -1.

	   /* Your solution goes here  */
	   public CarRecord() {
	      yearMade = 0;
	      vehicleIdNum = -1;
	   }

}
