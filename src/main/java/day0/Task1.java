package day0;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        while(x<9){
            x++;
            System.out.print("JAWA ");

        }
        for (int i =0; i<10;i++){
            System.out.println("JAWA");
        }
        int year = 1980;
        while(year<=2020){

            System.out.println("Олимпиада " + year + " года");
            year = year + 4;


        }
        System.out.println();
        for (int i = 1980; i<=2020; i = i + 4){
            System.out.println("Олимпиада " + i + " года");
        }
        System.out.println();
        int k;
        k = 3;
        for (int i = 1; i<10; i++){

            System.out.println(i + " x " + k + " = " + i*k);
        }
        System.out.println();

        int b;
        b = 3;
        int y = 1;

        while (y < 10){
            System.out.println(y + " x " + b + " = " + y*b);
            y++;

        }
    }
}
