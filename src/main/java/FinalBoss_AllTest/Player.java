package FinalBoss_AllTest;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    String[][] userField;

    private int deckcount;
    private int iterator;
    private int x;
    private int y;
    private String playerName;
    private static final String s = " X ";
    int hit = 0;


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Player(String[][] userField, int deckcount, int iterator) {
        this.userField = userField;
        this.deckcount = deckcount;
        this.iterator = iterator;

    }

    public  void drawField(String[][] userField) {
        //массив "буквенная челка" типа char
        String abc = "    1  2  3  4  5  6  7  8  9 10";
        char[] charArray = abc.toCharArray();

        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        int n = 1;

        // ЛЕВАЯ ШКАЛА
        for (int i = 0; i < 10; i++) {
            if (i < 9)
                System.out.print(n + "  ");
            if (i == 9)
                System.out.print(n + " ");

            // ОСНОВНОЙ МАССИВ

            for (int j = 0; j < userField[i].length; j++) {
                if (userField[i][j] == null) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(userField[i][j]);
                }
            }
            System.out.println();
            n++;

        }
    }

    public void installShip(String[][] userField) {
        drawField(userField);

        while (deckcount != 0) {

            System.out.println("Расставляем корабли");
            System.out.println("ВВЕДИТЕ напаравление: OX - 1, OY - 2 (или другое число)");
            int rotation = scanner.nextInt();

            if (rotation == 1) {
                System.out.println("Идем вправо → ");
                System.out.println("Ведите координаты ОХ");
                int x = scanner.nextInt() - 1;
                System.out.println("Введите координаты OY");
                int y = scanner.nextInt() - 1;


                Cell cell = new Cell(x, y); // возможна инверсия!


                //статический метод.
                Ship ship = Ship.create(Direction.Horizontal, cell, iterator); // тут сраззу при созданни обхекта вызывается метод класса
                //всё, создали например первый корабль.

                //теперь проверяем его на столкновение.

                boolean collides = false;
                for (int xi = 0; xi < 10; xi++) {
                    for (int yi = 0; yi < 10; yi++) {
                        if (s.equals(userField[yi][xi])) {
                            if (ship.collide(new Cell(xi, yi))) {   // смотрим реализацию метода в классе Ship          !! Поменяли местами x и y!

                                //мы вызываем метод класса cell только на объекте класса Ship. Таким образом,
                                //проверяем на коллайд имеющийся корабль и новую клетку


                                collides = true;
                            }
                        }
                    }
                }

                if (x > userField.length - 1 || x < 0 || y > userField.length - 1 || y < 0 || ((x + iterator) > userField.length)
                        || userField[x][y] != null || collides) {

//
                    System.out.println("ОШИБКА! Корабль вылезает за край или наезжает на другой корабль");
                    continue;
                }                                            //тут кончается внутренняя логика
                for (int i = 0; i < iterator; i++) {
                    userField[y][x] = s;
                    x++;
                    deckcount--;
                }
                drawField(userField);
                switch (deckcount) {

                    case 16:
                        iterator = 3;
                        break;
                    case 10:
                        iterator = 2;
                        break;
                    case 4:
                        iterator = 1;
                        break;
                    case 3:
                        iterator = 1;
                        break;
                    case 2:
                        iterator = 1;
                        break;
                    case 1:
                        iterator = 1;
                        break;
                }
            }

            if (rotation != 1) {      // ИДЕМ ВНИЗ

                System.out.println("Идем вниз ↓");
                System.out.println("Ведите координаты ОХ");
                int x = scanner.nextInt() - 1;
                System.out.println("Введите координаты OY");
                int y = scanner.nextInt() - 1;

                Cell cell = new Cell(x, y); // возможна инверсия!
                if (!cell.nextTo(cell) && !cell.touchCorner(cell)) {
                    Ship ship = Ship.create(Direction.Vertical, cell, iterator);

                    boolean collides = false;
                    for (int xi = 0; xi < 10; xi++) {               // проходимся циклом по всему массиву (он а параметрах метода)
                        for (int yi = 0; yi < 10; yi++) {
                            if (s.equals(userField[yi][xi])) {
                                if (ship.collide(new Cell(xi, yi))) {    // смотрим реализацию метода в классе Ship          !! Поменяли местами x и y!

                                    //мы вызываем метод класса cell только на объекте класса Ship. Таким образом,
                                    //проверяем на коллайд имеющийся корабль и новую клетку



                                    collides = true;
                                }
                            }
                        }
                    }
                    if (x > userField.length - 1 || x < 0 || y > userField.length - 1 || y < 0 || ((y + iterator) > userField.length) || userField[y][x] != null || collides) {
                        System.out.println("ОШИБКА! Корабль вылезает за край или наезжает на другой корабль");
                        continue;

//                          if (collides){
//                    System.out.println("ОШИБКА! Корабль вылезает за край или наезжает на другой корабль");
//                    continue;

                    }
                    for (int i = 0; i < iterator; i++) {
                        userField[y][x] = s;
                        y++;

                        deckcount--;
                    }
                    drawField(userField);
                    switch (deckcount) {

                        case 16:
                            iterator = 3;
                            break;
                        case 10:
                            iterator = 2;
                            break;
                        case 4:
                            iterator = 1;
                            break;
                        case 3:
                            iterator = 1;
                            break;
                        case 2:
                            iterator = 1;
                            break;
                        case 1:
                            iterator = 1;
                            break;
                    }
                }
            }
        }
    }

    public boolean makeTurn(Player player, String[][] userField, String[][] monitor) {


        while (true) {
            drawField(monitor);
            System.out.println(playerName + "Введите OX координаты для выстрела");
            int x = scanner.nextInt() - 1;
            if (x < 0 | x > 9) {

                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }
                System.out.println(playerName+ "Ошибка, стреляете мимо поля");
                break;
            }
            System.out.println(playerName + "Введите OY координаты для выстрела");
            int y = scanner.nextInt() - 1;
            if (y < 0 | y > 9) {
                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }
                System.out.println(playerName+ "Ошибка, стреляете мимо поля");
                break;
            }
            if (Objects.equals(userField[y][x], " X ")) {

                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }

                System.out.println(playerName+ "Попал! Стреляй снова!");
                monitor[y][x] = "[X]";
                hit++;

            } else {

                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }
                if (hit!= 4){
                System.out.println("Мимо! Очередь противника");}

                monitor[y][x] = " * ";
                break;
            }
        }

        return true;
    }

    public int getHit() {
        return hit;
    }

    @Override
    public String toString() {
        return playerName;
    }
}





































































