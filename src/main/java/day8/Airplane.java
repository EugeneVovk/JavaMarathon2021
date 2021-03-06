package day8;

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

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
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

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Изготовитель: ");
        str.append(producer);
        str.append(", год выпуска: ");
        str.append(year);
        str.append(", длина: ");
        str.append(length);
        str.append(", вес: ");
        str.append(weight);
        str.append(", количество топлива в баке: ");
        str.append(fuel);
        return str.toString();
        /**
         *  Тут выдаётся предупреждение: 'StringBuilder str' can be replaced with 'String'
         *  Мы можем сгенерировать toString и перенаправить его спомощью среды разработки - ALT+Insert
         *  далее немного изменить, чтобы соответствовало методу info()
         */
    }
}