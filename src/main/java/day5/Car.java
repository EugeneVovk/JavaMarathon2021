package day5;

public class Car {

    private int yearOfProduction;
    private String color;
    private String model;

    public void setYearOfProduction(int yearOfProduction) {
        if (yearOfProduction < 2015 || yearOfProduction > 2021)
            System.out.println("Введён некорректный год выпуска!");
        else
            this.yearOfProduction = yearOfProduction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        if (model.isEmpty())
            System.out.println("Введено пустое значение в поле model!");
        else
            this.model = model;
    }

    public String getModel() {
        return model;
    }
}
