package Assignment.inheritance;

public class ElectricCar extends Car {
    double batteryCapacity;

    public ElectricCar(String make,String model,int year, int numDoors, double batteryCapacity){
        super(make,model,year,numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(){
        System.out.println("Battery is charging");
    }

    @Override
    public void displayInfo() {
        System.out.println("Details of Electric Car");
        super.displayInfo();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}
