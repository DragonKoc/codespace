package advanced.alfa.lesson6.work2;

public class InvalidAgeException extends RuntimeException {

    @Override
    public String getMessage () {
        return "Возраст не входит в диапазон [1;120]";
    }
}
