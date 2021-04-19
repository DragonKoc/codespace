package advanced.alfa.lesson9.work2;

public class OverSizeExсeptoin extends ArrayIndexOutOfBoundsException{
    @Override
    public String getMessage() {
        return "количество создаваемых элементов больше, чем количество возможных значений.";
    }
}
