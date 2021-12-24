package day8;

public class Task1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s;
        for (int i = 0; i <= 20000; i++) {
            s = String.valueOf(i);  // convert int to string
            System.out.print(s);
        }
        System.out.println();
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));


        StringBuilder sb = new StringBuilder();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
        {
            sb.append(i);


        }
        long stopTime1 = System.currentTimeMillis();

        System.out.println(sb);

        System.out.println("Длительность работы, в мс.:" + (stopTime1 - startTime1));

    }
}




