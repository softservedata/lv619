package hw12Threads_IO.hw02;

public class Thread02  extends Thread{

	public void run() {
		synchronized(Appl1.obj2) {
			Thread.yield();

			synchronized(Appl1.obj1) {
				System.out.println("thread2 running");
			}
		}
	}
	
}