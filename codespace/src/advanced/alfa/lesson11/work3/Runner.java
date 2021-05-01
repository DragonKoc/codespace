package advanced.alfa.lesson11.work3;

import java.util.Arrays;

public class Runner {
    public void run(){
        MyMixer<Integer> mixer = new MyMixer<>(new Integer[]{1,2,3,4,5,6,7,8,9});
        mixer.shuffle();
        Integer[] arrayInt = mixer.getArray();
        System.out.println(Arrays.toString(arrayInt));

        MyMixer<String> myMixer = new MyMixer<>(new String[]{"asdf","qwerty","texxxx", "pop","cat"});
        myMixer.shuffle();
        String[] arrayStr = myMixer.getArray();
        System.out.println(Arrays.toString(arrayStr));
    }
}
