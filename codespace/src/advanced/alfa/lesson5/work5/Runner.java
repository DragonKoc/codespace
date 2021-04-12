package advanced.alfa.lesson5.work5;

public class Runner {

    public void run() {

        //1-5

        String rectangleInput = ( "Rectangle:RED:10,20" );
        String circleInput = ( "Circle:BLACK:10" );
        String triangleInput = ( "Triangle:GREEN:9,7,12" );
        String notNormal = ( "Triangle:YELLOW:1,1" );

        Shape.parseShape ( rectangleInput );
        Shape.parseShape ( circleInput );
        Shape.parseShape ( triangleInput );
        Shape.parseShape ( notNormal );

    }

}