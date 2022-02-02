package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(new File("dushi2.txt"));
        //  scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            for (String word : line.split("[.,:;()?!\"\\s–]+"))
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
        }
        scanner.close();
        int counter = 0;

       for (int i = 0; i < map.size(); i++) {

            int maxValueInMap = (Collections.max(map.values()));

            Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

            while (iterator.hasNext()) {

                Map.Entry<String, Integer> entry = iterator.next();
                if (maxValueInMap == entry.getValue()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                    counter ++;
                    iterator.remove();

                    }
                }
           if (counter == 100){
               break;
           }
        }
    }
}

// Чичиков : 601

// Entry это пара ключ-значение. Пары в Map не рассматриваются отдельно, а как своя структура данных.
// то есть Map.Entry - это мы получаем доступ к этой структуре данных. Далее ее параметризуем:
// <String, Integer> и даем имя.
// далее вызываем метод entrySet() на map. Этот метод возвращает набор всех пар ключ-значение на нашей map






























































