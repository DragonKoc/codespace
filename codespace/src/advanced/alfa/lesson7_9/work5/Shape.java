package advanced.alfa.lesson7_9.work5;


abstract public class Shape implements Drawable, Comparable <Shape>, Cloneable {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class=" + this.getClass().getSimpleName() +
                ", color=" + color;
    }

    abstract double calcArea();

    @Override
    public String draw(){
        return this.getClass().getSimpleName() +
                ", color=" + color;
    }


    @Override
    public int compareTo (Shape other) {
        if (this.calcArea () == other.calcArea () ){
            return 0;
        } else if (this.calcArea () < other.calcArea () ){
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    protected Shape clone () throws CloneNotSupportedException {
        return (Shape)super.clone ();
    }

    public static void parseShape ( String shapeType ){
        String [] shapeString = shapeType.split ( ":" );//Используйте метод split() класса String для разбора строки на лексемы(составляющие).
        String [] sizeString = shapeString[2].split ( "," );// ,
        int [] size = new int[sizeString.length];//количество параметров

        for (int i = 0; i < sizeString.length; i++) {
            size [i] = Integer.parseInt( sizeString[i] );
        }

        switch (shapeString[0]){
            case "Rectangle" : Rectangle.parseRectangle ( shapeType );
            break;
            case "Circle" :  Circle.parseCircle ( shapeType );
            break;
            case "Triangle" : Triangle.parseTriangle ( shapeType );
            break;
        }

    }

}
