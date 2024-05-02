package Assignment.abstractclass;

public class ImageDisplay extends MediaDevice{
    String imageName;
    String resolution;

    public ImageDisplay(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;

    }
    public void displayImage() {
        System.out.println("Displaying image: " + imageName);
    }
    public void displayDetails() {
        System.out.println("Image Display Device: " + name);
        System.out.println("Image Name: " + imageName);
        System.out.println("Resolution: " + resolution);
    }
}
