package day5;

/**
 * 2. Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
 */
public class Task2 {
    public static void main(String[] args) {

        Motorbike moto1 = new Motorbike(2020, "Blue", "BMW");

        System.out.println("\nMotorbike: " +
                "\n\tyearOfProduction = " + moto1.getYearOfProduction() +
                "\n\tcolor = " + moto1.getColor() +
                "\n\tmodel = " + moto1.getModel());

//        moto1.getInfo();
    }
}
