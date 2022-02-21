package FinalBoss_AllTest;

import java.util.*;

public class Utils {


    public static List<Integer> series(int initial, int length) {
        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = initial; i < initial + length; i++) {
            lst.add(i);
        }
        return lst;
    }
}
