package day6;

/**
 * 1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
 * В классах Автомобиль и Мотоцикл реализуйте два метода:
 * void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
 * и возвращает разницу между переданным годом
 * и годом выпуска транспортного средства (возвращаться должно всегда положительное число). *
 * В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */
public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setYear(2015);
        car1.setColor("White");
        car1.setModel("Tesla");

        Motorbike moto1 = new Motorbike("Husqvarna", "Grey", 2014);

        car1.info();
        int carYear = car1.yearDifference(2020);
        System.out.println("Этому транспорту: " + carYear + " года/лет.");

        moto1.info();
        int motoYear = moto1.yearDifference(2020);
        System.out.println("Этому транспорту: " + motoYear + " года/лет.");
    }
}
