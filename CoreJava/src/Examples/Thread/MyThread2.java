package Examples.Thread;

public class MyThread2 extends Thread
{
	@Override
    public void run() {
		 System.out.println("My Thread 2: " + Thread.currentThread().getName());
    }
}