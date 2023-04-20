package arrays;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        System.out.println("Area of circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(2.4, 5);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
