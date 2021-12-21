package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2011,145,100);
        airplane.setProdusser("Airbus");
        airplane.setReleaseYear(1999);
        airplane.setLength(133);
        airplane.setWright(80);
        airplane.info();
        airplane.setFuel(200);
        airplane.info();
        airplane.setFillUp(300);
        airplane.info();
        System.out.println("Сколько в баке: " + airplane.getFuel());
        airplane.setFillUp(500);
        airplane.info();








    }

}
