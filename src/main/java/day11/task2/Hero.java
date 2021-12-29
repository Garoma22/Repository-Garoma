package day11.task2;

public abstract class Hero implements PhysAttack {

    // исходя из таблицы, эти поля общие для всех героев
    // модификаторы доступа у все полей дефолт, потому что если private, то
    // у классов наследников не будет доступа к ним

    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0; // минимальное здоровье
    int health = 100;
    int physAttack;
    double physDef;
    double magicDef;


    // у каждого героя должно быть здоровье 100. Создаем конструктор без параметров
    // и сразу инициализируем его значением 100. Т.е. любой герой будет иметь здоровье 100;

//    public Hero() {
//        this.health = MAX_HEALTH;
//    }

    // также каждый герой может атаковать физически, поэтому имплементируем интерфейс
    // PhisAttack в абстрактный класс. Жесть!

    @Override
    public void physicalAttack(Hero h) {
        // прописываем логику метода. Расчитаем величину урона, которую наносит игрок.

        //величина атаки должна быть уменьшена на % защиты
        double attackScore = physAttack * (1 - h.physDef);
        if (h.health - attackScore < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;

        }
    }
}

