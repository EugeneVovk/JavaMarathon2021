package day5;

/**
 * 1. Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setYearOfProduction(2020);
        car1.setColor("White");
        car1.setModel("Tesla Model X");

        System.out.println("\nCar: yearOfProduction = " + car1.getYearOfProduction() +
                "\n\t color = " + car1.getColor() + "\n\t model = " + car1.getModel());
    }
}