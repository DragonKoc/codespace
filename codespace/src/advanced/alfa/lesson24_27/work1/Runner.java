package advanced.alfa.lesson24_27.work1;

public class Runner {

//    @SuppressWarnings("deprecated")
    public void run(){
        System.out.println(
//                findMax(2,5,11,56,-9,88,-100,55));
//                findMax());
//                  this.<Integer>findMax(new Integer[]{ 100,2,400}));
                  this.<Long>findMax(new Long[] { 100L,2L,400L}));
    }

    /**
     * @deprecated use method findMax(int...)
     */
    @Deprecated
    public int findMax(int... array){
//        int maxValue = Integer.MIN_VALUE;
        int maxValue = array[0];
        for (int element: array) {
            if (maxValue < element){
                maxValue = element;
            }
        }
        return maxValue;
    }

//    @SafeVarargs
    public final <T extends Number> T findMax(T... array){
        T maxValue = array[0];
        for (T element: array) {
            if (maxValue.doubleValue() < element.doubleValue()){
                maxValue = element;
            }
        }
        return maxValue;
    }
}
