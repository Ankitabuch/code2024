package april23.Poly;

public class Circle extends Shape {

    double area=0;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {

        System.out.print("Area of the Circle: "+ (area = (radius*radius)));
    }
}
