package april23.Poly;

public class Rectangle extends Shape {

    int area =0;
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void getArea() {
        System.out.println("Area of rectangle: "+ (area = (length * width)));
    }
}
