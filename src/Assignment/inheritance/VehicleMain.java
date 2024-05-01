package Assignment.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        // Creating objects and demonstrating functionality
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.displayInfo();
        car.start();
        car.stop();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR450YU", 2023,4);
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();

        System.out.println();

        ElectricCar electricCar = new ElectricCar("Tesla","Model S",2023,4,1000.45);
        electricCar.displayInfo();
        electricCar.start();
        electricCar.stop();
    }
}
