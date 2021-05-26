package advanced.alfa.lesson19_22.work5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {
    public void run(){
        long startConcurrentMap = System.nanoTime();
        Map<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();
        WriteMap writeConcurrentMap = new WriteMap(concurrentMap);
        writeConcurrentMap.run();
        ReadMap readConcurrentMap = new ReadMap(concurrentMap);
        readConcurrentMap.run();
        long endConcurrentMap = System.nanoTime();
        System.out.println("Time work concurrent map: " + (endConcurrentMap - startConcurrentMap));

        System.out.println("-----------------------------------------");


        Map<Integer, Integer> map = new HashMap<>();
        synchronized (map) {
            long startHashMap = System.nanoTime();
            WriteMap writeMap = new WriteMap(map);
            writeMap.run();
            ReadMap readMap = new ReadMap(map);
            readMap.run();
            long endHashMap = System.nanoTime();
            System.out.println("Time work hash map: " + (endHashMap - startHashMap));
        }
    }
}
