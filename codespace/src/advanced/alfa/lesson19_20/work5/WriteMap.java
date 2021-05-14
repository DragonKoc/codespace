package advanced.alfa.lesson19_20.work5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WriteMap implements Runnable{
    private Map<Integer, Integer> map;

    public WriteMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public void write(){
        for (int i = 0; i < 10; i++) {
            map.put(i, new Random().nextInt((100 - 10 + 1)));
        }
    }

    @Override
    public void run() {
        write();
    }
}
