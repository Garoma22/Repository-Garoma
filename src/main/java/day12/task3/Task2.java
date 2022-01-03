package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();

        for (int i = 0; i <=350; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        list.subList(16,150).clear();
        System.out.println(list);


    }
}
