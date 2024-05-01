package Assignment.inheritance;

public class Car extends Vehicles {
    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void displayInfo(){
        System.out.println("\nDetails of Car");
        super.displayInfo();
        System.out.println("umber of doors: "+ numDoors);
    }
}
