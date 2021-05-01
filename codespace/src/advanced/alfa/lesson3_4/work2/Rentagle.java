package advanced.alfa.lesson3_4.work2;

public class Rentagle extends Shape{
    double width;
    double height;

    public Rentagle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rentagle() {
    }

    @Override
    public String toString() {
        return "Rentagle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        double squareRentagle = width*height;
        return squareRentagle;

    }
}
