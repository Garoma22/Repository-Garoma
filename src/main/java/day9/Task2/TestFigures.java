package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

//        Circle circle = new Circle("Green", 12);
//        Rectangle rectangle = new Rectangle("Red", 5,7);
//        Triangle triangle = new Triangle("Black", 6,6,6);
//
//
//        System.out.println(circle.area());
//        System.out.println(circle.perimeter());
//
//        System.out.println(rectangle.area());
//        System.out.println(rectangle.perimeter());
//
//        System.out.println(triangle.area());
//        System.out.println(triangle.perimeter());


        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),

                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),

                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(figures[0].perimeter());
        System.out.println(figures[2].perimeter());
        System.out.println(figures[3].perimeter());
        System.out.println(figures[5].perimeter());
        System.out.println(figures[6].perimeter());

        System.out.println();

        System.out.println(calculateRedArea(figures));
        System.out.println(figures[0].area());
        System.out.println(figures[2].area());
        System.out.println(figures[3].area());
        System.out.println(figures[5].area());
        System.out.println(figures[6].area());

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumRedPerimetre = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].color.equals("Red"))
                sumRedPerimetre = sumRedPerimetre + figures[i].perimeter();

        }
        return sumRedPerimetre;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumRedArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].color.equals("Red"))
                sumRedArea = sumRedArea + figures[i].area();


        } return sumRedArea;

    }
}




