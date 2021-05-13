package day9.Task2;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }
}