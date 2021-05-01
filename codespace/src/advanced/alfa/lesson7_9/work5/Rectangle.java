package advanced.alfa.lesson7_9.work5;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rentangle{" + "color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double calcArea() {
        double squareRentangle = width*height;
        return squareRentangle;

    }

    @Override
    public String draw() {
        return "class="+ super.draw() + ", wight=" + width + ", height=" +height;
    }

    public static void parseRectangle (String rectangleInput) {
        String [] rectangleInputArray = rectangleInput.split ( ":" );
        String [] sizeInput = rectangleInputArray[2].split ( "," );
        int [] size = new int[sizeInput.length];
        for (int i = 0; i < sizeInput.length; i++) {
            size [i] = Integer.parseInt( sizeInput[i] );
        }

        Shape shapeRectangle = new Rectangle( rectangleInputArray[1], size[0], size[1] );
        System.out.println (shapeRectangle.draw ());
    }

}
