package Multithreading;

public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread 1 is running");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
