package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Ford Ranger");
        car.setColor("Blue");
        car.setRelease(2005);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getRelease());
    }
}
class Car{
    private String model;
    private String color;
    private int release;

    public void setModel(String model) {

        this.model = model;
    }
    public void setColor(String color){
        if (color.isEmpty())
            System.out.println("Хамелион");
        this.color = color;
    }
    public void setRelease(int reliase){
        if(reliase < 2000)
            System.out.println("Машина времени");
        else
        this.release = reliase;
    }
    public String getModel() {
        return model;}
    public String getColor(){
        return color;}
    public int getRelease (){
        return release;
    }
}
