package day7;


public class Task1 {
public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1999, 30,
        40000);
        airplane.fillUp(400);
        airplane.info();
        airplane.setLength(44);

        Airplane airplane2 = new Airplane("SU", 2009, 39,
                30000);
        airplane2.fillUp(100);
        airplane2.info();

        Airplane.compareAirplanes(airplane,airplane2);


        }
}