package advanced.alfa.lesson5_6.work1;

import java.util.Arrays;

import static advanced.alfa.lesson5_6.work1.MyComparatorColor.colorSort;

public class Runner {

    public void run() throws CloneNotSupportedException{

        //create
        Shape[] figures = createShape();

        //show
        //showfigures(figures);

        //show by draw()
        for (Shape figdraw: figures
             ) {
            System.out.println(figdraw.draw());
        }

        //compareTo
        Triangle compTriangle1 = new Triangle("black",3, 2, 2);
        Triangle compTriangle2 = new Triangle("red",4, 5, 8);
        compareShape(compTriangle1,compTriangle2);

        //sort
        Shape[] sortfigures = (createShape());
        Arrays.sort (sortfigures);
        //showfigures(sortfigures);
        for (Shape x: sortfigures) {
            System.out.println(x.toString() +" , " + x.calcArea());
        }

        //sort by color
        colorSort(sortfigures);
        showfigures(sortfigures);

        //clone
        //java: unreported exception java.lang.CloneNotSupportedException; must be caught or declared to be thrown
        //add to all
        Shape cloneFigure = figures[1].clone();

        System.out.println ( "Original: "+figures[1]);
        System.out.println ( "Clone cloneFigure = figures[1] : "+cloneFigure );
        System.out.println ( "Change clone:" );
        cloneFigure.setColor("yellow");
        System.out.println(cloneFigure.getColor());
        System.out.println ( "Clone UPDATE cloneFigure = figures[1] : "+cloneFigure);
        System.out.println ( "Original: "+figures[1]);

    }

    private Shape[] createShape(){
            Shape[] figures = new Shape[]{new Rentagle("black",6, 6), new Rentagle("red",5, 6), new Rentagle("green",7, 8), new Rentagle("blue",9, 10),
                new Circle("black",3), new Circle("red",4), new Circle("blue",2),
                new Triangle("black",3, 2, 2), new Triangle("red",4, 5, 8)};
        return figures;
    }

    //compareTo()
    public static void compareShape ( Shape firstShapes, Shape secondShape ){
        if (firstShapes.calcArea () == secondShape.calcArea () ){
            System.out.println("площадь обьектов  равна");
        } else if (firstShapes.calcArea () < secondShape.calcArea () ){
            System.out.println("площадь второго обьекта больше");
        } else {
               System.out.println("площадь второго обьекта меньше");
    }}

    public void showfigures(Shape[] figures){
        for (Shape f : figures) {
            System.out.println(f.toString());
        }
    }

    public static double allSquare(Shape[] figures) {
        double allsquare = 0.0;
        for (int i = 0; i < figures.length; i++) {
            allsquare += figures[i].calcArea();
        }
        return allsquare;
    }

}