package advanced.alfa.lesson19_22.work3;

public class Storage {
    private volatile int i = 0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
