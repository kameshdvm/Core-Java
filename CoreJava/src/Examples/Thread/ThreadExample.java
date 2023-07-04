package Examples.Thread;

public class ThreadExample {
    public static void main(String[] args) {
        // Create a new thread using the Thread class
        Thread myThread = new MyThread();

        // Start the thread
        myThread.start();

        // Print the name of the main thread
        System.out.println("Main Thread: " + Thread.currentThread().getName());

        // Create and start a thread using an anonymous class
        Thread anonymousThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread: " + Thread.currentThread().getName());
            }
        };
        anonymousThread.start();

        // Sleep the main thread for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive
        System.out.println("Is myThread alive? " + myThread.isAlive());

        // Interrupt the anonymous thread
        anonymousThread.interrupt();

        // Wait for myThread to complete its execution
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the name of the main thread
        Thread.currentThread().setName("NewMainThread");

        // Print the updated name of the main thread
        System.out.println("Updated Main Thread: " + Thread.currentThread().getName());
    }
}

// Custom thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("My Thread: " + Thread.currentThread().getName());
    }
}
