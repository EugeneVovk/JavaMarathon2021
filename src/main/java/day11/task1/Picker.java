package day11.task1;

public class Picker implements Worker {

    private int salary;
    // ему выплачивается заработная плата - 80, запишем как константу
    private static final int TASK_SALARY = 80;
    //  также нам необходимо иметь доступ к полям класса Warehouse
    //  для этого можем реализовать хранение ссылки на объект класса Склад в поле этого класса
    private Warehouse w;  //  инициализируем это поле через конструктор
    private boolean isPayed;

    //  инициализируем поле с помощью конструктора
    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        //  при каждом вызове этого метода ЗП сборщика должна увеличиваться на велечину TASK_SALARY
        salary += TASK_SALARY;
        //  а также в классе склад должно увеличиваться поле кол-ва собранных заказов на +1
        w.incrementPickedOrders();

    }

    @Override
    public void bonus() {
        //  когда на складе собрано 10.000 заказов, Сборщику выплачивается бонус в размере 70.000
        //  если кол-во собранных заказов меньше 10 000, необходимо выводить фразу в консоль: "Бонус пока не доступен"
        if (w.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        //  проверяем и ограничиваем, был ли выплачен бонус. вводим переменную типа boolean
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        //  иначе единоразово выплачиваем бонус
        salary += 70_000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}