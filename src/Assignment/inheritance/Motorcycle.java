package Assignment.inheritance;

public class Motorcycle extends Vehicles {
    int numCylinder;

   public Motorcycle(String make, String model, int year, int numCylinder){
       super(make, model, year);
       this.numCylinder = numCylinder;
   }
   public void displayInfo(){
       System.out.println("Details of MotorCycle");
       super.displayInfo();
       System.out.println("Number of Cylinder: "+ numCylinder);
   }
}
