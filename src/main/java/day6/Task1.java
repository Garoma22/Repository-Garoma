package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
    car.setRelease(2024);
    car.setModel("Mustang");
    car.info();
    int carDiff = car.yearDifference(2022);
    System.out.println("тачке : " + carDiff);

    Motorbike motorbike = new Motorbike("BMW","black",
            2024);

    motorbike.info();

    int bikeDiff = motorbike.yearDifference(2022);
        System.out.println("байку : " + bikeDiff);
    }
}
