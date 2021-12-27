package day9.Task2;

public class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle( double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {

        double areaOfRectangle = width*height;

        return areaOfRectangle;
    }

    @Override
    public double perimeter() {

        double perimeterOfRectangle = (width + height)*2;

        return perimeterOfRectangle;
    }
}
