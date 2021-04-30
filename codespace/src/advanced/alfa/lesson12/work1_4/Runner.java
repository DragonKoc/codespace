package advanced.alfa.lesson12.work1_4;

import java.util.*;

public class Runner {
    public void run(){

        List<String> listStr = createListString();
        System.out.println(listStr);
        updateList(listStr, x -> MyConverter.isNull(x) ? x : x.toUpperCase());
        System.out.println(listStr);
        updateList(listStr, x -> MyConverter.isNull(x) ? x : x.concat(x));
        System.out.println(listStr);
    }

    private List<String> createListString(){
        Random random = new Random();
        List<String> stringList = new ArrayList<>();
        String temp = "ab@bklksfj lsKK%1jfijwe";
        for (int i = 0; i < 12; i++) {
            int pos = random.nextInt(temp.length());
            stringList.add(temp.substring(pos,pos+1));
        }
        return stringList;
    }

    public void updateList(List<String> list, MyConverter converter){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, converter.convertString(list.get(i)));
        }
    }
}
