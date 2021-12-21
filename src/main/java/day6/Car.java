package day6;

import javax.swing.*;

class Car {
    private String model;
    private String color;
    private int release;
 int currentYear = 2022;
    void info() {
        System.out.println("Этот автомобиль");
    }
    int yearDifference(int inputYear) {
        int currentYear = 2022;
        if (inputYear > currentYear){
            System.out.println("Этот год еще не наступил");
            return 0;}
        if (inputYear < currentYear){
            System.out.println("На дворе сейчас " + currentYear + " год. Введите его");
            return 0;}

        if (inputYear < release){
            System.out.println("Тачку еще не произвели.Тачку сделают через " + (release - currentYear) + " год/года/лет");
            return 0;}

        else
            inputYear = inputYear - release;
        return inputYear;
    }

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
