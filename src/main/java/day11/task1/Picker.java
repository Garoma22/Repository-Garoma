package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private boolean isPayed;

    // Пикер должен иметь доступ к полям класса "Скалад", дял этого мы
    // сохраняем ссылку на обхект класса "Склад" в поле пикера.
    //Указываем, что у нас будет переменная типа Warehouse.

    private Warehouse w;
    // Чтобы инициализировать поле применяем конструктор.
    // Переходим к объекту в main

    public Picker(Warehouse w){
        this.w = w;
    }

    public int getSalary()
    {
    return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders(); // метод инкрементирует
    }
    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000){ // геттер просто показывает
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 70000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPaid=" + isPayed +
                '}';
    }
}

