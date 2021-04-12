package advanced.alfa.lesson8.work3;

import advanced.alfa.lesson5.work2.Rank;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int ind = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[ind];
            array[ind] = temp;
        }
    }
}
