package Examples.Thread;

public class MyThread extends Thread {
	// Print the name of the main thread
	@Override
    public void run() {
        System.out.println("My Thread 1: " + Thread.currentThread().getName());
    }
}