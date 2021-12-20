package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            int flor = scanner.nextInt();

            if (flor >= 1 && flor <= 4) {
                System.out.println("Малоэтажный дом");
            } else if (flor >= 5 && flor <= 8) {
                System.out.println("Среднеэтажный дом");
            } else if (flor < 1) {
                System.out.println("Ошибка ввода");
            } else {
                System.out.println("Многоэтажный дом");

            }

        }
    }

