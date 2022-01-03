package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Lada");
        list.add("BMW");
        list.add("УАЗ");
        list.add("Lamborghini");
        list.add("Ford");

        System.out.println(list);

        list.add(2,"KIA");
        list.remove(0);
        System.out.println(list);


    }
}
