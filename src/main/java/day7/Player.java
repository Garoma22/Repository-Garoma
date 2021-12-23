package day7;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;


    Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers = 6;

        }
    }

    public void setStamina(int heel) {
        stamina = stamina + heel;
        if ((stamina + heel) > MAX_STAMINA){
            stamina = MAX_STAMINA;
        }
        if (stamina > 0) {
            countPlayers = countPlayers + 1;
        }
    }

    public int getCountPlayers(){
        return countPlayers;
    }

    public int getStamina() {
        if (stamina <= MAX_STAMINA) {



        } return stamina;
    }

        void run () {
            stamina--;
            System.out.println("Выносливость игрока " + stamina);
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                }
            }

        static void info () {
        if (countPlayers == 5) {
                System.out.println("Команды неполные. На поле еще есть " +
                        (6 - countPlayers) + " свободное место");
            }else if (countPlayers < 5 && countPlayers >1){
                System.out.println("Команды неполные. На поле еще есть " +
                        (6 - countPlayers) + " свободных места");
            }else if (countPlayers == 1 ){
                System.out.println("Команды неполные. На поле еще есть " +
                        (6 - countPlayers) + " свободных мест");
            }else if (countPlayers == 0 ){
                System.out.println("Эй, где все?! На поле еще есть " +
                        (6 - countPlayers) + " свободных мест");
            } else {
                System.out.println("На поле нет свободных мест");
            }
        }
    }










