package april20.bike;

public class BikeMain {
    public static void main(String[] args){
        engine engine = new engine("SP 001",2000, 50);
        Bike bike = new Bike("Honda","Red",engine);
        System.out.println(bike.engine.maxSpeed);
    }
}
