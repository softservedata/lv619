package hw12Threads_IO.hw02;

public class Thread01  extends Thread{

	public void run() {
		synchronized(Appl1.obj1) {
			Thread.yield();

			synchronized(Appl1.obj2) {
				System.out.println("thread1 running");
			}
		}
	}
	
}
