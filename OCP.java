interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length;
    double width;

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10.5;
        r.width = 20.0;

        Circle c = new Circle();
        c.radius = 1.0;

        AreaCalculator a = new AreaCalculator(); // Instantiate AreaCalculator object

        System.out.println(a.calculateShapeArea(r)); // Calculate and print area of rectangle
        System.out.println(a.calculateShapeArea(c)); // Calculate and print area of circle
    }
}
