package advanced.alfa.lesson6.theory;

public class KocException extends RuntimeException{
    private int a;

    public KocException(String message, int a) {
        super(message + " " + a);
    }
}
