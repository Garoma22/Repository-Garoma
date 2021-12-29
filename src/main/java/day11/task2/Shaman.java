package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    int magicAttack = 15;

    static final int HEAl_AMOUNT = 50;
    static final int HEAL_TEAMMATE_AMOUNT = 30;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAttack = 10;

    }


    @Override
    public void healHimself() {

        if (health + HEAl_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAl_AMOUNT;
        }

    }

    @Override
    public void healTeammate(Hero h) {
        // обращаемся к полю здоровья героя,
        // который передается в аргументах метода
        if (h.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            h.health = MAX_HEALTH;
        } else {
            h.health += HEAL_TEAMMATE_AMOUNT;
        }

    }

    @Override
    public void magicalAttack(Hero h) {

        double attackScore = magicAttack * (1 - h.magicDef);
        if (h.health - attackScore < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;

        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
