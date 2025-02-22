package Concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

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

        /**
         * In this case sout statement will be executed within one of the 10 threads.
         * */
        executorService.submit(() -> {
            System.out.println("Here is a thread from executor services - 1!, and current thread is :" + Thread.currentThread().getName());
            LOGGER.log(Level.INFO, "Current thread is :" + Thread.currentThread().getName());
        });

        executorService.shutdown();

        //new thread
        /**
         * In this case sout statements will be executed within different threads.
         * */
        ExecutorService executorService2 = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService2.submit(() -> {
                System.out.println("Here is a thread from executor services - 2!, and current thread is :" + Thread.currentThread().getName());
                LOGGER.log(Level.INFO, "Current thread is :" + Thread.currentThread().getName());
            });
        }

        executorService2.shutdown();
    }
}
