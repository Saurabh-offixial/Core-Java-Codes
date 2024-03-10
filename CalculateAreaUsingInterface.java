// Interface to define the getArea() method
interface Shape {
  double getArea();
}

// Class representing a circle implementing the Shape interface
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

// Class representing a rectangle implementing the Shape interface
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

// Main class to demonstrate usage
class AreaCalculator {
  public static void main(String[] args) {
    // Create a Circle object
    Circle circle = new Circle(5);
    System.out.println("Area of circle: " + circle.getArea());

    // Create a Rectangle object
    Rectangle rectangle = new Rectangle(10, 6);
    System.out.println("Area of rectangle: " + rectangle.getArea());

    // Polymorphism: Treat both objects as Shapes
    Shape[] shapes = {circle, rectangle};
    for (Shape shape : shapes) {
      System.out.println("Area of shape: " + shape.getArea());
    }
  }
}
