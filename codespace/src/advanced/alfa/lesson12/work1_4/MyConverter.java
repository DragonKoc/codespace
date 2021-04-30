package advanced.alfa.lesson12.work1_4;

public interface MyConverter {
    String convertString(String str);
    public static boolean isNull(String str){
        return str == null ? true : str.trim().equals("") ? true : false;
    }
}
