package advanced.alfa.lesson5_6.work1;

public class Rentagle extends Shape {
    double width;
    double height;

    public Rentagle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rentagle() {
    }

    @Override
    public String toString() {
        return "Rentagle{" + "color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        double squareRentagle = width*height;
        return squareRentagle;

    }

    @Override
    public String draw() {
        return "class="+ super.draw() + ", wight=" + width + ", height=" +height;
    }
}
