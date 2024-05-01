package Assignment.inheritance;

public class Vehicles {
    String make;
    String model;
    int year;

    public Vehicles(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.println("Starting the vehicle...");
    }
    public void stop(){
        System.out.println("Stopping the vehicle...");
    }
    public void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
