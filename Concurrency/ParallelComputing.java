package Concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelComputing {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new SumTask(1, 10)); // Sum from 1 to 10
        System.out.println("Sum: " + result);
    }
}

class SumTask extends RecursiveTask<Integer> {
    private int start, end;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected Integer compute() {
        if (end - start <= 5) { // Base case
            int sum = 0;
            for (int i = start; i <= end; i++) sum += i;
            return sum;
        } else { // Split task
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(start, mid);
            SumTask rightTask = new SumTask(mid + 1, end);
            leftTask.fork(); // Start asynchronously
            return rightTask.compute() + leftTask.join(); // Combine results
        }
    }
}
