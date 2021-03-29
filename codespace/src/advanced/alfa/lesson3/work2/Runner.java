package advanced.alfa.lesson3.work2;

public class Runner {

    public void run() {

        Shape[] figures = new Shape[]{new Rentagle(6, 6), new Rentagle(5, 6), new Rentagle(7, 8), new Rentagle(9, 10),
                new Circle(3), new Circle(4), new Circle(2),
                new Triangle(3, 2, 2), new Triangle(4, 5, 8)};

        for (Shape f : figures
        ) {
            System.out.println(f.toString());
        }

        System.out.println("Вчисление общей площади всех фигур: " + allSquare(figures));
        System.out.println("Вчисление общей площади всех кругов: " + allSquareByFigure(figures, "circle"));
        System.out.println("Вчисление общей площади всех треугольников: " + allSquareByFigure(figures, "triangle"));
        System.out.println("Вчисление общей площади всех квадратов: " + allSquareByFigure(figures, "rentagle"));
    }

    public static double allSquare(Shape[] figures) {
        double allsquare = 0.0;
        for (int i = 0; i < figures.length; i++) {
            allsquare += figures[i].calcArea();
        }
        return allsquare;
    }

    public static double allSquareByFigure(Shape[] figures, String types) {
        double squarebyfigure = 0.0;
        if (types == "triangle") {
            for (int i = 0; i < figures.length; i++) {
                if (figures[i] instanceof Triangle) {
                    squarebyfigure += figures[i].calcArea();
                }
            }
        }
        else if(types == "circle"){
            for (int i = 0; i < figures.length; i++) {
                if (figures[i] instanceof Circle) {
                    squarebyfigure += figures[i].calcArea();
                }
            }
        }
        else if(types == "rentagle"){
            for (int i = 0; i < figures.length; i++) {
                if (figures[i] instanceof Rentagle) {
                    squarebyfigure += figures[i].calcArea();
                }
            }
        }
        return squarebyfigure;
    }
}