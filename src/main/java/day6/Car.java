package day6;

public class Car {

    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        if (year < 2015 || year > 2021)
            System.out.println("Введён некорректный год выпуска!");
        else
            this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        if (model.isEmpty())
            System.out.println("Введено пустое значение в поле model!");
        else
            this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        //return (inputYear > year ? (inputYear - year : 0);
        return Math.abs(inputYear - year);
    }
}
