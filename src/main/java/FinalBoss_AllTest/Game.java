package FinalBoss_AllTest;

import day11.task2.day11.Warrior;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] userField1 = new String[10][10];
        String[][] userField2 = new String[10][10];
        String[][] monitor1 = new String[10][10];
        String[][] monitor2 = new String[10][10];

        Player player1 = new Player(userField1, 20, 4);
        Player player2 = new Player(userField2, 20, 4);

        System.out.println("Введите имя первого игрока: ");
        player1.setPlayerName(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        player2.setPlayerName(scanner.nextLine());

        System.out.println(player1.getPlayerName() + ", разместите свои кораблики");
        player1.installShip(userField1);
        System.out.println(player2.getPlayerName() + ", разместите свои кораблики");
        player2.installShip(userField2);

        do {
            System.out.println();
            System.out.println(player1.getPlayerName() + ", хуярьте");
            player1.makeTurn(player1, userField2, monitor1);

            if (player1.getHit() == 4) {
                System.out.println(player1 + " ПОЕДИТЕЛЬ! ИГРА ОКОНЧЕНА!");
                System.out.println();
                System.out.println("Вот где " + player2 + " занычил свои корабли: ");
                player1.drawField(userField2);
                return;
            }

            System.out.println(player2.getPlayerName() + ", хуярьте");
            player2.makeTurn(player2, userField1, monitor2);
            if (player2.getHit() == 4) {
                System.out.println();
                System.out.println(player2 + " ПОЕДИТЕЛЬ! ИГРА ОКОНЧЕНА!");
                System.out.println("Вот где " + player1 + " занычил свои корабли: ");
                player2.drawField(userField1);
                return;
            }
            } while (true) ;
        }
    }





