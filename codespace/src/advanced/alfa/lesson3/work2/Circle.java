package advanced.alfa.lesson3.work2;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calcArea() {
        double pi =Math.PI;
        double squareCircle = radius*radius *pi;
        return squareCircle;
    }

}
