package day11.task1;

public class Warehouse {

    //  кол-во собранных заказов
    private int countPickedOrders;
    //  кол-во доставленных заказов
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    //  по условии задания при выполнении работы сборщиком или курьером данные поля должны увеличиваться каждый раз на +1
    //  чтобы это реализовать нам необходимо два метода
    public void incrementPickedOrders() {
        countPickedOrders++;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}