package advanced.alfa.lesson19_20.work5;

import java.util.Map;

public class ReadMap implements Runnable {
    private Map<Integer, Integer> map;

    public ReadMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public void read() {
        for (int i = 0; i < 10; i++) {
            Integer integer = map.get(i);
            System.out.println(integer);
        }
    }

    @Override
    public void run() {
        read();
    }
}
