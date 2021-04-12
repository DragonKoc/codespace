package advanced.alfa.lesson5.work5;

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

    public static void parseCircle (String circleInput) {

        String [] circleInputArray = circleInput.split ( ":" );
        String [] sizeInput = circleInputArray[2].split ( "," );
        int [] size = new int[sizeInput.length];

        for (int i = 0; i < sizeInput.length; i++) {
            size [i] = Integer.parseInt( sizeInput[i] );
        }

        Shape shapeCircle = new Circle ( circleInputArray[1], size[0]);
        System.out.println ( shapeCircle.draw () );

    }

}
