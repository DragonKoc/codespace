package advanced.alfa.lesson9.work3;

import java.util.*;
import java.util.Scanner;

public class MyTranslator {
    Map<String,String> engrus = new HashMap<>();

    public MyTranslator(){
    }

    public void addWords(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте слово на английском: ");
        String eng = scanner.nextLine();
        System.out.println("Добавьте слово перевод: ");
        String rus = scanner.nextLine();
        engrus.put(eng, rus);
    }

    public String translate (String engString){
        String[] engArrayString = engString.split( " " );
        String[] rusArrayString = new String[engArrayString.length] ;
        String perevod = "";
        for (int i = 0; i <engArrayString.length ; i++) {
            if (engrus.get (engArrayString[i]) != null ){
                rusArrayString[i] = engrus.get (engArrayString[i]);
            }else {
                rusArrayString[i] = null;
            }
        }
        for (int i = 0; i <rusArrayString.length ; i++) {
            perevod += rusArrayString[i]+" ";
        }
        return perevod ;
    }

}
