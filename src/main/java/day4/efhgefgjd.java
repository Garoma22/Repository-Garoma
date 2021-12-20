package day4;

import java.util.Arrays;

class efhgefgjd {
    public static void main(String[] args) {




    }



    public String[] concatArray(String[] a, String[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        String[] r = new String[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;


    }

    String[] week1 = new String[] { "Понедельник", "Вторник", "Среда" };

    String[] week2 = new String[] { "Четверг", "Котопятница", "Субкота",
            "Воскресенье" };

    String[] week = concatArray(week1, week2); // будет возвращён массив всех семи дней недели



        }








