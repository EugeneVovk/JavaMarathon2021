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
}
