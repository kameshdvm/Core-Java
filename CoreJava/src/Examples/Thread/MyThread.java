package Examples.Thread;

public class MyThread extends Thread {
	// Print the name of the main thread
	@Override
    public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("My Thread 1: ");	
		}
        
    }
}