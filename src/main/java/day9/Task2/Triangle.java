package day9.Task2;

public class Triangle extends Figure {

    double a;
    double b;
    double c;



    public Triangle( double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override

    public double area() {

        double p = perimeter();  //приравниваем метод к переменной, чтобы удобнее было писать формулу
        double q = p/2;           // полупериметр
        double areaOfTriangle = Math.sqrt(q*(q-a)*(q-b)*(q-c));

        return areaOfTriangle;
    }

    @Override
    public double perimeter() {

        double perimeterOfTriangle = a+b+c;

        return perimeterOfTriangle;
    }
}
