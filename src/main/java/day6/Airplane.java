package day6;

public class Airplane {
    private String produsser;
    private int releaseYear;
    private int length;
    private int weight;
    private int fuel;
    private int fillUp;


    void info() {
        System.out.println("Изготовитель: " + produsser + ", год выпуска: " + releaseYear +
                ", длина: " + length + ", вес: " + weight + ", в баке: " + getFuel() );
    }

    Airplane(String produsser, int releaseYear, int length, int weight) {

        this.produsser = produsser;
        this.releaseYear = releaseYear;
        this.length = length;
        this.weight = weight;

    }

    public void setProdusser(String produsser) {
        this.produsser = produsser;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWright(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel ;
    }
    public int getFuel() {
        return fuel+fillUp;
    }

    public void setFillUp(int fuel) {
        this.fillUp = fillUp + fuel;
    }
        public int getFillUp(){
        return fillUp;

    }

}







