package Examples.Thread;

public class ThreadExample {
    public static void main(String[] args) {
        // Create a new thread using the Thread class
        MyThread myThread = new MyThread();
        MyThread2 myThread2 =new MyThread2();
        
        Thread myThread3=new Thread(new MyThread3());
        
        // Start the thread
        myThread.start();
        myThread.run();
        
        myThread2.start();
        myThread2.run();
        
        myThread3.start();
        myThread3.run();
         
        
        // Sleep the main thread for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive
        System.out.println("Is myThread alive? " + myThread.isAlive());

        // Interrupt the anonymous thread
        myThread.interrupt();

        
        // Set the name of the main thread
        Thread.currentThread().setName("NewMainThread");

        // Print the updated name of the main thread
        System.out.println("Updated Main Thread: " + Thread.currentThread().getName());
        
       
    }
}





