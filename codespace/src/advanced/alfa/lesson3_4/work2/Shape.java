package advanced.alfa.lesson3_4.work2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape(){
    }

    @Override
    public String toString() {
        return "class=" + this.getClass().getSimpleName() +
                ", color=" + color;
    }

    public double calcArea(){
        return 0.0;
    }
}
