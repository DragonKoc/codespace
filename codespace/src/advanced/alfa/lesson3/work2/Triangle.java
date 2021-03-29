package advanced.alfa.lesson3.work2;

public class Triangle extends Shape{
    double a,b,c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
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
}
