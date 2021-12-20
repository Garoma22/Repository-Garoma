package day3;

import javafx.scene.paint.Stop;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        while (true) {

            String town = scanner.nextLine();

            if (town.equals("Stop")){
                break;
            }

            switch (town) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");

            }
        }
    }
}
