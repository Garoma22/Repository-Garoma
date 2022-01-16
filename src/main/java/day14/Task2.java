package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file = new File("test3");
        parseFileToStringList(file);

    }
    public static List<String> parseFileToStringList(File file)  {

        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("-"))
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return null;
                    }

                arrayList.add(line);
            }
        System.out.println(arrayList);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return arrayList;
    }
}









