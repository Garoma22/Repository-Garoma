package day14;

import day9.Task1.Human;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("test3");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] obj = line.split(" ");

                if (Integer.parseInt(obj[1]) < 0)
                    throw new IOException();

                Person currentPerson = new Person(obj[0], Integer.parseInt(obj[1]));
                personList.add(currentPerson);
            } scanner.close();

            return personList;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}




