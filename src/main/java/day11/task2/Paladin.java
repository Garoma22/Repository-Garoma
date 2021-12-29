package day11.task2;

public class Paladin extends Hero implements Healer {


    static final int HEAl_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT = 20;

    public Paladin(){
        physDef = 0.5;
        magicDef = 0.2;
        physAttack = 15;
    }

    @Override
    public void healHimself() {
        if (health + HEAl_AMOUNT > MAX_HEALTH){
            health = MAX_HEALTH;
        }
        else {
            health += HEAl_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero h) {
        // обращаемся к полю здоровья героя,
        // который передается в аргументах метода
        if (h.health + HEAL_TEAMMATE_AMOUNT >MAX_HEALTH ){
            h.health = MAX_HEALTH;
        }else{
            h.health += HEAL_TEAMMATE_AMOUNT;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}


