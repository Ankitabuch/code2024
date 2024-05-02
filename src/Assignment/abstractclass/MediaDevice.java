package Assignment.abstractclass;

abstract public class MediaDevice {
    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    abstract void displayDetails();
}
