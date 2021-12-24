package day8;
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

    public void info() {
        System.out.println("Изготовитель: " + produsser + ", год выпуска: "
                + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: "
                + fuel);
    }
    public void fillUp(int inputFuel) {
        fuel += inputFuel; // говорим: вот есть такой метод, он отдельно вляет на fuel
    }

    public void setProdusser(String produsser) {
        this.produsser = produsser;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Изготовитель: " + produsser + ", год выпуска: "
                + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: "
                + fuel;

    }
}

















