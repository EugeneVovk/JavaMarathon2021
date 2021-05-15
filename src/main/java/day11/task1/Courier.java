package day11.task1;

public class Courier implements Worker {

    private int salary;
    private static final int TASK_SALARY = 100;
    private Warehouse w;
    private boolean isPayed;

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
        //  Когда клиентам доставлено 10.000 заказов, Курьеру выплачивается бонус в размере 50.000
        if (w.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50_000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}