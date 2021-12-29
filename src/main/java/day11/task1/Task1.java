package day11.task1;

public class Task1 {
    public static void main(String[] args) {



    //Созадем "Склад".
    Warehouse warehouse = new Warehouse();

    //Теперь каждый раз, создавая нового сборщика мы должны в аргументы
    //конструктора передавать ссылку на класс "Склад".
    Picker picker = new Picker(warehouse);
    Courier courier = new Courier(warehouse);


   // вызываем метод на пикере
        businessProcess(picker);
        System.out.println(picker); // тут вызывается метод toString
        System.out.println(warehouse); // проверяем поля склада

        businessProcess(courier);
        System.out.println(courier); // тут вызывается метод toString
        System.out.println(warehouse); // проверяем поля склада


        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        courier2.doWork();


//        Проверяем поля у первоначальных рабочих
        System.out.println(picker); // тут вызывается метод toString
        System.out.println(courier);
        System.out.println(warehouse); // проверяем поля склада

}


// Метод принимает в параметр любой класс, реализующий интерфейс Worker
    // Метод имитирует бизнесс-процесс
    public static void businessProcess (Worker worker){
        for (int i = 1; i <=10000; i++) {
            worker.doWork();

        }worker.bonus();
    }
}