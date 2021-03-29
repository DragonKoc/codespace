package advanced.alfa.lesson4.work1;

public class Triangle extends Shape {
    double a,b,c;

    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "color=" + color +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        double squareTriangle = Math.sqrt ( p*((p-a)*(p-b)*(p-c)) );
        return squareTriangle;
    }

    @Override
    public String draw() {
        return "class="+ super.draw() + ", a=" + a + ", b=" +b + ", c="+c;
    }
}
