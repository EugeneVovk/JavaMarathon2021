package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer
                + ", год выпуска: "
                + year + ", длина: " + length
                + ", вес: " + weight
                + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.length > b.length)
            System.out.println("Первый самолет длиннее");
        else if (a.length < b.length)
            System.out.println("Второй самолет длиннее");
        else
            System.out.println("Длины самолетов равны");
    }
}