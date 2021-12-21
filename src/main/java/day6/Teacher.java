package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    private String estiamte;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;

    }

    public void evaluate(Student student) {

        int min = 2;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int ball = random.nextInt(diff + 1);
        ball += min;


        if (ball == 2) {
            estiamte = "Пара";
        }
        if (ball == 3) {
            estiamte = "Трояк";
;        }
        if (ball == 4) {
           estiamte = "Четыре";
        }
        if (ball == 5) {
            estiamte = "Пять";
        }

        System.out.println("Преподаватель " + name + " оценила студента с именем " + student.getName1() +
                " по предмету " + getSubject() + " на оценку " + estiamte);
    }


    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }
}
class Student {
    private String name1;

    Student (String name){
        this.name1 = name1;
    }
    public void setName1(String name1){
        this.name1 = name1;
    }

    public String getName1(){
        return name1;
    }
}