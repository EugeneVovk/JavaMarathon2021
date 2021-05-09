package day6;

public class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
//        System.out.println("\nMotorbike: " +
//                "\n\tyearOfProduction = " + yearOfProduction +
//                "\n\tcolor = " + color +
//                "\n\tmodel = " + model);
    }

    public int yearDifference(int inputYear) {
        //return (inputYear > year ? (inputYear - year : 0);
        return Math.abs(inputYear - year);
    }

    public void printYearDifference(int year) {
        System.out.print("Этому транспорту: " + year + " года/лет.");
    }
}
