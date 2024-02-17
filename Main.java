interface Shape {
    Double calculateArea();
}

class Rectangle implements Shape {
    Double length;
    Double width;

    public Double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    Double radius;

    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public Double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

class Run {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10.5;
        r.width = 20.0;

        AreaCalculator a = new AreaCalculator();
        System.out.println("Rectangle area: " + a.calculateShapeArea(r));

        Circle c = new Circle();
        c.radius = 1.0;
        System.out.println("Circle area: " + a.calculateShapeArea(c));
    }
}
