public class Square extends Rectangle {


    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }


    public double getSide() {
        return width;
    }

    public void setSide(double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    @Override
    double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
