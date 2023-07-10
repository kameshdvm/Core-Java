package Examples.Thread;

public class MyThread3 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("My Thread 3: " + Thread.currentThread().getName());
		
	}

}
