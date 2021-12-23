package day7;

public class Airplane {
    private String produsser;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public Airplane(String produsser, int year, int length, int wright) {
        this.produsser = produsser;
        this.year = year;
        this.length = length;
        this.weight = wright;
        this.fuel = 0;  // это поле в этом конструкторе = 0
    }

     void info() {
        System.out.println("Изготовитель: " + produsser + ", год выпуска: "
                + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: "
                + fuel);
    }
     void fillUp(int inputFuel) {
        fuel += inputFuel; // говорим: вот есть такой метод, он отдельно вляет на fuel
    }

     void setProdusser(String produsser) {
        this.produsser = produsser;
    }

     void setYear(int year) {
        this.year = year;
    }

     void setLength(int length) {
        this.length = length;
    }

     void setWeight(int weight) {
        this.weight = weight;
    }


    static void compareAirplanes(Airplane airplane, Airplane airplane2){

        if (airplane.length> airplane2.length){
            System.out.println(airplane.produsser + " длиннее");
        }else{
            System.out.println(airplane2. produsser + " длиннеее");

        }
    }
}


















