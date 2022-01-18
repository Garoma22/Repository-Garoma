package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("Test4");
        printResult(file);
    }
    public static void printResult(File file){

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];


            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // ВАРИАНТ 1 (если нужно получить строку)

            double result = sum/(double) numbers.length;
            System.out.printf(result + " --> %.3f", result);


            // ВАРИАНТ 2 (если нужно получить число типа double, а не строку)

//            double average = sum/numbers.length;
//            double scale = Math.pow(10, 3);
//            double result = Math.ceil(average * scale) / scale;
//
//            System.out.println(average + " --> " + result);


        } catch (FileNotFoundException e) {
            System.out.println("Файл-источник не найден");
        }
    }
}

