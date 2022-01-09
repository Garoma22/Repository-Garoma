package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {


    public static void main(String[] args) {


        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hello from user1!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, User1!");
        user2.sendMessage(user1, "I am user2, Nice to meet you!");
        user2.sendMessage(user1, "I am fine, and you?");

        user3.sendMessage(user1, "Hey! My name is user3.");
        user3.sendMessage(user1, "Do you remember me?");
        user3.sendMessage(user1, "We went to the same school");

        user1.sendMessage(user3, "Hey user3! Of course i remember you!");
        user1.sendMessage(user3, "So nice to see you again");
        user1.sendMessage(user3, "Let's meet up. Are you free tomorrow?");

        user3.sendMessage(user1, "Yep, I'm free tomorrow. Let's go!");

        MessageDatabase.showDialog(user1, user2);

    }
}






