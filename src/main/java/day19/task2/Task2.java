package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        Map<Integer, Point> map = new HashMap<>();
        Scanner scanner = new Scanner(new File("19_test.txt"));

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            String[] carString = line.split(" ");

            int[] intArray = new int[carString.length];

            int i = 0;
            for (String str : carString) {
                intArray[i] = Integer.parseInt(str);

                map.put(intArray[0], new Point(intArray[1], intArray[2]));
                i++;
            }
        }

        // Задаем квадрат точками.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите кооринаты x1,y1");
        Point point1 = new Point(scanner1.nextInt(), scanner1.nextInt());
        System.out.println("Введите кооринаты x2,y2");
        Point point2 = new Point(scanner1.nextInt(), scanner1.nextInt());
        scanner.close();

        // проходимся по Map

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {

            int xCar = entry.getValue().getX();
            int yCar = entry.getValue().getY();

            // сравниваем поля

            if (point2.getX() > xCar && xCar > point1.getX() && point2.getY() > yCar && yCar > point1.getX())

            System.out.println(entry.getKey());

            }
        }
    }








// Вопрос, если сравнить объект point1 и  entry.getValue(), как именно происходит сравнение.
// Предполагаю, что отдельно по полям.

//

















//        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
//
//            for (Map.Entry<Integer, Point> entry1 : map.entrySet()) {
//                if (point1.equals(entry.getValue()))
//                    System.out.println(entry.getKey() + " ^ " + entry.getValue());
//
//            }
//        System.out.println(entry.getKey() + " ^ " + entry.getValue());
//
//       for (int i = 0; i < map.size(); i++) {

//        Iterator<Map.Entry<Integer, Point>> itr = map.entrySet().iterator();
//
//        while (itr.hasNext()) {
//
//            Map.Entry<Integer, Point> entry = itr.next();
//
//            if (point1 == entry.getValue()) {
//                System.out.println(entry.getKey());
//            }
//        }
//    }
//}
//
//
//























                //if (point1.equals(entry.getValue()) | point2.equals(entry.getValue()))









//                if (point2 == entry.getValue() | point1 == entry.getValue()) ;
//                return;




//
//    Iterator<Map.Entry<Integer, Point>> itr = map.entrySet().iterator();
//
//        while (itr.hasNext()) {
//                Map.Entry<Integer, Point> entry = itr.next();
//
//        if (point1.equals(entry.getValue()) | point2.equals(entry.getValue()){
//        System.out.println(entry.getKey());
//
//
//        if (point2 == entry.getValue() | point1 == entry.getValue()) ;
//        return;
//        }
//        }
//        }
//        }











//        for (int i = 0; i < map.size(); i++) {
//
//            for (Map.Entry<Integer, Point> entry : map.entrySet()) {
//
//                if (point1 == entry.getValue() | point2 == entry.getValue()) {
//                    do {
//                        System.out.println(entry.getKey() + " : " + entry.getValue());
//                    } while (point2 == entry.getValue() | point1 == entry.getValue());
//                }
//            }
//        }
//    }
//}


// Map это не коллекция, а интерфейс. Следовательно, мы не можем итерировать Map итератором.
// Окей. что такое итератор? Итератор это один из трех курсоров в Java. (Iterator, Enumeretor, Listerator)
// . Курсор нужен чтобы итерировать, проходить или получать.
// Итераторы в Java are used in the Collection framework to retrieve(извлекать) elements one by one.
// Итератор позволяет: читать и удалять.
// Итератор должен использоваться, если применяется Interface Map.Entry<K,V>
//

















//        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            Point value = entry.getValue();
//            if (entry.getValue() == point1 || entry.getValue() == point2) {
//                System.out.println(point1);








                //map2.put(entry.getKey(), entry.getValue());


//        System.out.println(point1);
//        System.out.println(point2);

//        Map<Integer, Point> map2 = new HashMap<>();

//











//        printMap(map,point1,point2);
//    }
//
//    public static void printMap ( Map map,Point point1,Point point2){
//        Iterator it = map.entrySet().iterator();
//        while (it.hasNext()){
//            Map.Entry pair = (Map.Entry)it.next();
//           // System.out.println(pair.getKey() + " = " + pair.getValue());
//            if (pair.getValue() == point1 || pair.getValue() == point2){
//                System.out.println(pair);



//            Map.Entry<Integer, Point> entry : map.entrySet()  {
//            Integer key = entry.getKey();
//            Point value = entry.getValue();
//            if (entry.getValue() == point1 || entry.getValue() == point2){
//                System.out.println(entry);


//            if (map.values() == point1 || map.values() == point2){
//                map2.put(entry.getKey(), entry.getValue());


//    }
//}






















        //scanner.close();

//        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
//
//            //  System.out.println(entry.getKey() + " : " + entry.getValue().toString());
//
//        }




        //askSquare(map);


//        try (Scanner scanner1 = new Scanner(System.in)) {
//
//            // вводим x1y1
//            System.out.println("Введите координаты x1 (enter) y1");
//            int x1;
//
//            do {
//                System.out.println("Введите координату Х1 от 1 до 100: ");
//
//                x1 = scanner.nextInt();
//
//            } while (x1 <= 0 || x1 > 100);
//            System.out.println("Вы ввели корректное значнеие");
//
//            int y1;
//
//            do {
//                System.out.println("Введите координату Y1 от 1 до 100: ");
//                y1 = scanner.nextInt();
//            } while (y1 <= 0 || y1 > 100);
//            System.out.println("Вы ввели корректное значнеие");
//
//            Point x1y1 = new Point(x1, y1);
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Вводите координаты от 1 до 100");

// вводим x2y2

//            Scanner scanner2 = new Scanner(System.in);
//            System.out.println("Введите координаты x2 (enter) y2");
//            int x2;
//
//            do {
//                System.out.println("Введите координату Х2 от 1 до 100: ");
//
//                x2 = scanner.nextInt();
//
//            } while (x2 <= 0 || x2 > 100);
//            System.out.println("Вы ввели корректное значнеие");
//            System.out.println("Введите координаты (enter) x2y2");
//            int y2;
//
//            do {
//                System.out.println("Введите координату Y2 от 1 до 100: ");
//                y2 = scanner.nextInt();
//            } while (y2 <= 0 || y2 > 100);
//            System.out.println("Вы ввели корректное значнеие");
//
//            Point x2y2 = new Point(x2, y2);






















//    public static void askSquare(Map map) {
//        Scanner scanner = new Scanner(System.in);
//        int x1;
//        do {
//            System.out.println("Введите координату Х1 от 1 до 100: ");
//            x1 = scanner.nextInt();
//        } while (x1 <= 0 || x1 > 100);
//        System.out.println("Вы ввели корректное значнеие");
//
//        int y1;
//        do {
//            System.out.println("Введите координату Y1 от 1 до 100: ");
//            y1 = scanner.nextInt();
//        } while (y1 <= 0 || y1 > 100);
//        System.out.println("Вы ввели корректное значнеие");
//
//











//       while (true) {
//               if (x1 <= 0 || x1 > 100) {
//               System.out.println("Введите координату Х1 от 1 до 100: ");
//               x1 = scanner.nextInt();
//               } else {
//               System.out.println("Ты ввел некорректное число");



//                if (x1 <= 0 || x1 > 100)
//                    System.out.println("Введите корректное число");
//                return;




//            System.out.println("Введите координату Y1 от 0 до 100: ");
//        if (scanner.nextInt() >0 && scanner.nextInt()<= 100){
//                int y1 = scanner.nextInt();
//            }else {
//                System.out.println("Введите корректное число");
//                return;
//            }
//        }
//    }


































//        while (scanner.hasNextLine()) {
//
//                String line = scanner.nextLine();
//
//                for (String word : line.split("[.,:;()?!\"\\s–]+"))
//                if (map.) {
//                map.put(1, Point);
//                } else {
//                map.put(word, map.get(word) + 1);
//                }
//                }


