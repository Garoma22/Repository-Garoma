package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
//        int[][] array = new int[12][8];
//        int[] sum1 = new int[12];
//
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                array[i][j] = random.nextInt(50);
//                System.out.print(array[i][j] + " ");
//            }
//            // сумма элементов каждого массива
//            int sum = 0;
//            for (int element : array[i]) {
//
//                sum = sum + element;
//                sum1[i] = sum;
//
//            } System.out.println("// сумма " + sum);
//
//            // ищем максимальную сумму
//            int maxSum = 0;
//            for (int counter : sum1) {
//                if (counter > maxSum)
//                    maxSum =  counter;
//
//            } System.out.println("// максимальная сумма " + maxSum);
//        }
//    }
//}
//
//
//          НА САМОМ ДЕЛЕ КРУТО !

        int[][] array = new int[12][8];


        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);

            }
        }

        // посчитали сумму по строкам
        int maxSum = 0; // храним максимальный элемент ВНЕ ЦИКЛА!
        int maxSumIdx = 0; // храним индекс максимальной суммы


        for (int i = 0; i < array.length; i++) {

            int sum = 0; // для каждой новой строки сумма будет инициализироваться 0

            for (int j = 0; j < array[i].length; j++) { // обращаюсь к конкретной строке
                sum += array[i][j];
            }
            if (sum >= maxSum) { // обновляем значение текущего максимума на каждой итерации внешнего цикла
                maxSum = sum;
                maxSumIdx = i; // параллельный счетчик (КРУТО!)
            }
        }
        System.out.println(maxSumIdx);

    }
}











