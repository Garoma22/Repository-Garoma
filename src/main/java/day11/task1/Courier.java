package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int TASK_SALARY = 100;
    private boolean isPayed;
    private Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {

        if (w.getCountDeliveredOrders() < 10000) { // геттер просто показывает
            System.out.println("Бонус пока не доступен");
            return;

        }

        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;

        }
            salary += 50000;
            isPayed = true;

    }
    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPaid=" + isPayed +
                '}';
    }
}
