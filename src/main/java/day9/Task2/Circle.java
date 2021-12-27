package day9.Task2;

public class Circle extends Figure {

    Double radius;

    public Circle( double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {

        double areaOfRound = Math.pow(radius,2)* Math.PI;

        return areaOfRound;
    }

    @Override
    public double perimeter() {
        double perimetreOfRound = (radius + radius) * Math.PI;
        return perimetreOfRound;

    }
}

