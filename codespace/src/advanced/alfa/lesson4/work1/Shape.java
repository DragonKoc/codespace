package advanced.alfa.lesson4.work1;

import java.util.Comparator;

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
        return "class=" + this.getClass().getSimpleName() +
                ", color=" + color;
    }

    @Override
    public int compareTo (Shape another) {
        if (this.calcArea () == another.calcArea () ){
          //  System.out.println("площадь обьектов " + this.getClass().getSimpleName() + " равна");
            return 0;
        } else if (this.calcArea () < another.calcArea () ){
          //  System.out.println("площадь второго обьекта " + this.getClass().getSimpleName() + " больше");
            return -1;
        } else {
         //   System.out.println("площадь второго обьекта " + this.getClass().getSimpleName() + "  меньше");
            return 1;
        }
    }

    @Override
    protected Shape clone () throws CloneNotSupportedException {
        return (Shape)super.clone ();
    }

}
