package advanced.alfa.lesson19_22.work2;

public class MySumCount_1 extends Thread {

    int startIndex;
    int stopIndex;
    Integer[] myArray;
    long resultSum;

    public void sumCount(Integer[] arrayInt){
        long k = 0;
        for (int i = startIndex; i <= stopIndex; i++)
            k += arrayInt[i];
        setResultSum(k);
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public Integer[] getMyArray() {
        return myArray;
    }

    public void setMyArray(Integer[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setResultSum(long resultSum) {
        this.resultSum = resultSum;
    }

    @Override
    public void run() {
        sumCount(myArray);
    }
}

