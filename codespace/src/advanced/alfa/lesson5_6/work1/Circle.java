package advanced.alfa.lesson5_6.work1;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" + "color=" + color +
                ", radius=" + radius +
                '}';
    }



    @Override
    public double calcArea() {
        double pi =Math.PI;
        double squareCircle = radius*radius *pi;
        return squareCircle;
    }

    @Override
    public String draw() {
        return "class="+ /*this.getClass().getSimpleName()*/ super.draw() + ", radius=" + radius;
    }

}
