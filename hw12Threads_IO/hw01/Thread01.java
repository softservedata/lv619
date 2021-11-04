package hw12Threads_IO.hw01;

public class Thread01 extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 1 running");
		}
	}

}
