package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));


        int counterMax = 0;
        for (int element : array) {
            if (element > counterMax)
                counterMax = element;
        }
//      МОЙ ВАРИАНТ
//
//      int counterMin = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < counterMin)
//                counterMin = array[i];

        int counterMin = array[0];
        for (int element : array) {
            if (element < counterMin)
                counterMin = element;

        }

        int counter0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0)
                counter0++;

            }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0)
                sum = sum + array[i];
        }

        System.out.println(counterMax);
        System.out.println(counterMin);
        System.out.println(counter0);
        System.out.println(sum);

    }
}
