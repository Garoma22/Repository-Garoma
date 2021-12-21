package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike enduro = new Motorbike("BMW", "Black",1997);
        System.out.println(enduro.getModel());
        System.out.println(enduro.getColor());
        System.out.println(enduro.getRelease());

        System.out.println();

        Motorbike enduro1 = new Motorbike("Jawa","Red");
        System.out.println(enduro1.getModel());
        System.out.println(enduro1.getColor());
    }
}
class Motorbike{

        private String model;
        private String color ;
        private int release;

        Motorbike (String model, String color){
            this.model = model;
            this.color = color;
        }
        Motorbike(String model, String color, int release){
            this.model = model;
            this.color = color;
            this.release = release;
        }
        public String getModel(){
            return model;
        }
        public String getColor(){
            return color;
        }
        public int getRelease() {
        return release;
    }
}
