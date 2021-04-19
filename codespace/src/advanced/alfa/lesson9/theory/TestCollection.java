package advanced.alfa.lesson9.theory;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

    public static void main(String[] args) {
        Collection<String> mycol1 = new ArrayList<>();
        mycol1.add("test1");
        mycol1.add("test2");
        mycol1.add("test3");

        System.out.println(mycol1);
    }
}
