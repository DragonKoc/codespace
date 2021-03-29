package advanced.alfa.lesson4.work1;

public class MyComparatorColor {

    public static void colorSort(Shape[] figurearray) {

        for (int i = 0; i < figurearray.length; i++) {
            for (int k = 0; k < figurearray.length; k++) {
                if (figurearray[i].color.compareTo(figurearray[k].color) < 0) {
                    Shape temporary = figurearray[i];
                    figurearray[i] = figurearray[k];
                    figurearray[k] = temporary;
                }
            }
        }
    }
}