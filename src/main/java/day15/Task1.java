package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("missing_shoes.txt");

        try {
            PrintWriter pw = new PrintWriter(file);

            Scanner scanner = new Scanner(new File("shoes1.csv"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    throw new IllegalArgumentException();
                }
                String[] obj = line.split(";");

                if (obj.length > 3) {
                    System.out.println(Arrays.toString(obj));
                    throw new IOException();

                }

                if (Integer.parseInt(obj[2]) == 0 | line.contains(";0")) {

                    pw.println(line);
                }

            }
            pw.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IllegalArgumentException e) {
            System.out.println("В файле пробелы");

        } catch (IOException e) {
            System.out.println("Колонок больше чем 3");

        }
    }
}