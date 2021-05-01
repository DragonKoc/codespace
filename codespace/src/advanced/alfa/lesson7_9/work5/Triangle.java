package advanced.alfa.lesson7_9.work5;

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

    public static void parseTriangle (String triangleInput) {

        String [] triangleInputArray = triangleInput.split ( ":" );
        String [] sizeInput = triangleInputArray[2].split ( "," );
        int [] size = new int[sizeInput.length];

        for (int i = 0; i < sizeInput.length; i++) {
            size [i] = Integer.parseInt( sizeInput[i] );
        }

        Shape shapeTriangle = new Triangle ( triangleInputArray [1], size[0], size[1], size[2]);
        System.out.println ( shapeTriangle.draw () );
    }
}
