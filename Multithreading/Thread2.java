package Multithreading;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread 2 is running");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
