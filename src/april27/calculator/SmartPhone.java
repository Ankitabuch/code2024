package april27.calculator;

public class SmartPhone implements Camera,Computer{

    @Override
    public void cameraSpecification() {
        //super.finalize();
       // return null;
    }

    @Override
    public Void cameraQuality() {
        return null;
    }

    @Override
    public boolean display() {
        return true;
    }

    @Override
    public void calculate() {
        System.out.println("Smart phone can calculate");
    }
}
