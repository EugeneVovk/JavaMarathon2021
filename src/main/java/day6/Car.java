package day6;

public class Car {

    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
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
