public class Circle extends Shape {

    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.1415;
    }

    double getPerimeter() {
        return 2 * 3.1415 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

