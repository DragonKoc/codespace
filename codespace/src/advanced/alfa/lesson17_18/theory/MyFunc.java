package advanced.alfa.lesson17_18.theory;

public  interface MyFunc {
    int calc(int x);

    static int testLmb(int[] arr, MyFunc fnc)
    {int fsum= 0;
        for (int element : arr) {
            fsum+= fnc.calc(element);
        }
        return fsum;
    }
}
