package day7;

/**
 * Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 * В классе Самолет реализовать статический метод compareAirplanes,
 * который в качестве аргументов принимает два объекта класса Airplane (два самолета)
 * и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Airbus", 2006, 73, 300000);
        Airplane airplane2 = new Airplane("Boeing", 2005, 68, 250000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}