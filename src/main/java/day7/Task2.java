package day7;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(90, 101));
        Player player2 = new Player(random.nextInt(90, 101));
        Player player3 = new Player(random.nextInt(90, 101));
        Player player4 = new Player(random.nextInt(90, 101));
        Player player5 = new Player(random.nextInt(90, 101));
        Player player6 = new Player(random.nextInt(90, 101));
        Player player7 = new Player(random.nextInt(90, 101));
        Player player8 = new Player(random.nextInt(90, 101));
        Player player9 = new Player(random.nextInt(90, 101));

        for (int i = player1.getStamina(); i > 0 ; i--) {
            player1.run();
        }
        for (int i = player2.getStamina(); i >0 ; i--) {
            player2.run();
        }
        for (int i = player3.getStamina(); i >0 ; i--) {
            player3.run();
        }
        for (int i = player4.getStamina(); i >0 ; i--) {
            player4.run();
        }
        for (int i = player5.getStamina(); i >0 ; i--) {
            player5.run();
        }
        for (int i = player6.getStamina(); i >0 ; i--) {
            player6.run();
        }



        player6.setStamina(50);

        Player.info();

    }
}


