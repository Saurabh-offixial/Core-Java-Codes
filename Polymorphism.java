interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class AreaCalculator {
    public void calculateArea(Shape shape) {
        System.out.println("The area of the shape is: " + shape.getArea());
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        calculator.calculateArea(circle); // Output: The area of the shape is: 78.53981633974483
        calculator.calculateArea(rectangle); // Output: The area of the shape is: 24.0
    }
}