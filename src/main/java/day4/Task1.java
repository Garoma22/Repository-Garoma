package day4;//package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] matrice = new int[scanner.nextInt()];

        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 0; i < matrice.length; i++) {

            matrice[i] = random.nextInt(10);

            if (matrice[i] > 8) {
                counter++;
            }
            if (matrice[i] == 1) {
                counter1++;
            }
            if (matrice[i] % 2 == 0) {
                counter2++;
            }
            if (matrice[i] % 2 != 0) {
                counter3++;
            }
        }
        System.out.println(Arrays.toString(matrice));
        System.out.println("Длина массива: " + matrice.length);
        System.out.println("Количество чисел больше 8: " + counter);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counter2);
        System.out.println("Количество нечетных чисел: " + counter3);
        System.out.println(Arrays.stream(matrice).sum());
    }
}


//        Scanner scanner = new Scanner(System.in);
//        int arrayLength = scanner.nextInt();
//
//        Random random = new Random();
//        int[] array = new int[arrayLength];
//
//        for (int i = 0; i < array.length; i++)
//            array[i] = random.nextInt(10);
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(array.length);
//
//        int counter8 = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 8)
//                counter8++;
//
//        }
//        System.out.println(counter8);
//
//        int counter1 = 0;
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] == 1)
//                counter1++;
//
//        }
//        System.out.println(counter8);
//
//
//        int counterEven = 0;
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] % 2 == 0)
//                counterEven++;
//
//            }
//            System.out.println(counterEven);
//
//                int counterOdd = 0;
//            for (int k : array) {
//                if (k % 2 != 0)
//                    counterOdd++;
//
//            }
//                System.out.println(counterOdd);
//
//                int sum = 0;
//                for (int j = 0; j < arrayLength; j++) {
//                    sum += array[j];
//                }
//                System.out.println(sum);
//            }
//        }






