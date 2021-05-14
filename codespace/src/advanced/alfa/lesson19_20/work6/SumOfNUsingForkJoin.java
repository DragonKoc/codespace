package advanced.alfa.lesson19_20.work6;

import java.util.concurrent.RecursiveTask;

public class SumOfNUsingForkJoin {
    private static long N = 1000_000L;
    private static final int NUM_THREADS = 10;

    static class RecSumOfN extends RecursiveTask<Long> {
        long from, to;

        public RecSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public Long compute() {
            if ((to - from) <= N / NUM_THREADS) {
                long localSum = 0;
                for (long i = from; i <= to; i++) {
                    localSum += i;
                }
                System.out.printf("\t Summing of range %d to %d is %d %n",
                        from, to, localSum);
                return localSum;
            } else {
                long mid = (from + to) / 2;
                System.out.printf("Forking Into twe ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);
                RecSumOfN firstHalf = new RecSumOfN(from, mid);
                firstHalf.fork();
                RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }

        }
    }
}
