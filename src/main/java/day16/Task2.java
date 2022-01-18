package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        int n = 1000;
        int number;
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);

        while (n > 0) {
            number = random.nextInt(100);
            pw1.print(number + " ");
            n--;
        }
        pw1.close();

        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] arrayString = line.split(" ");
        int[] arrayNumbers = new int[arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arrayString[i]);
        }
        int counter = 0;
        int sum = 0;
        for (int arrayNumber : arrayNumbers) {
            sum += arrayNumber;
            counter++;

            if (counter == 20) {
                double average = (double) sum / 20;

                pw2.print(average + " ");
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        scanner.close();

        printResult(file2);
    }
    public static void printResult(File file2) {


        try {
            Scanner scanner = new Scanner(file2);

            String line = scanner.nextLine();
            String[] arrayString = line.split(" ");
            double[] arrayNumbers = new double[arrayString.length];

            double sum = 0;
            for (int i = 0; i < arrayString.length; i++) {
                arrayNumbers[i] = Double.parseDouble(arrayString[i]);

                sum += arrayNumbers[i];
            }
            System.out.println((int)sum);


        } catch (FileNotFoundException e) {
            System.out.println("Файл 2 не найден");
        }
    }
}





