package Concurrency;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("Here is a thread!");
        });
    }

    public static void executorServiceInvoke() {
        //create a thread pool which contains 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            System.out.println("Here is a thread from executor services!");
        });
    }
}
