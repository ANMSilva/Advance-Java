package Multithreading;

public class Multithreading {

    /**
     * Concurrency in Java allows multiple threads to run simultaneously,
     * enabling parallel execution and better utilization of CPU resources.
     * It is widely used for building efficient, high-performance, and responsive applications.
     *
     * Thread - smallest lightweight process(mini version of process) and threads exist within process
     * */

    /**
     * Ways to create threads
     *
     * extends Thread class
     * implements runnable interface
     *
     * why?
     * ------ because Java not support multiple inheritance ----------
     * public class Thread2 extends Student extends Thread -> not support
     * public class Thread2 extends Student implements Runnable -> support
     *
     * */

    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < n; i++) {
            /**
             * when you extend Thread class, execution is so simple
             * */
            Thread1 t1 = new Thread1();
            t1.start(); // change the state from ready to running

            /**
             * when you implement Runnable interface, execution is quite complex
             * */
            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}
