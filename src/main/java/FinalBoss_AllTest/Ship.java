package FinalBoss_AllTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ship {


    public final List<Cell> decks;    // создали список объектов типа Cell

    //создаем конструктор
    private Ship(List<Cell> decks) {  // конструктор, нужен для определения, что при создании корабля, используюем списко обхектов типа cell по имени decks
        this.decks = decks;
    }


    //пилим корабль
    public static Ship create(Direction direction, Cell initial, int numberOfDecks) {
        List<Cell> cells = new ArrayList<>();  //превращаем инты из списка ниже в объекты.

        if (direction == Direction.Horizontal) {
            List<Integer> series = Utils.series(initial.getX(), numberOfDecks);    // вступает класс Utils
            // поступило значенеи, мы его обрабатываем методами класса Utils и кладем в лист
            // в листе теперь лежит например так [6][7][8][9]

            for (Integer coor : series)                    //далее проходимся по листу циклом
                cells.add(new Cell(coor ,initial.getY())); // создаем и добавляем обхекты, у которых кооординаты X увеличиваются
            //а координаты Y какими были, такими и остаются.  (итератор coor тут итерирует по ячейками листа, они у нас getХ
            // в итоге получаем лист обхектов типа Cell, у каждого по 2 поля

        } else {
            List<Integer> series = Utils.series(initial.getY(), numberOfDecks);
            for (Integer coor : series)
                cells.add(new Cell(initial.getX(),coor)); // тут итерируем по Y// !!     ПОМЕНЯЛИ МЕСТАМИ АРГУМЕНТЫ

        }

        return new Ship(cells); //метод ретюрнит новый обхект типа Ship и у него в параметрах список клеток.
    }

    public boolean collide(Cell otherDeck) {  // какая-нибудь другая клатка вновь создаваемого корабля
        for (Cell deck : decks) { // идет по декам уже созданных кораблей
            if (deck.equals(otherDeck) || deck.nextTo(otherDeck) || deck.touchCorner(otherDeck))

                return true;

        }
// else
        return false;
    }


    private static final Random random = new Random();

    @Override
    public String toString() {
        return "Ship {" + decks.stream().map(Cell::toString).collect(Collectors.joining(", ")) + "}";
    }
}
